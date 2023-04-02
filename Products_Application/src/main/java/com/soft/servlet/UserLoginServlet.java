package com.soft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.soft.dao.DBConnection;

@WebServlet("/login")
public class UserLoginServlet extends GenericServlet {

	Connection con = null;

	public void init() {
		DBConnection dbcon = new DBConnection();
		con = dbcon.creatConnection();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");

			String Email = req.getParameter("email");
			String Password = req.getParameter("password");

			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM product_application.userdata where Email=? AND Password=?");
			ps.setString(1, Email);
			ps.setString(2, Password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				req.setAttribute("UserName",rs.getString(2));
				pw.print("User Login Sucessfully");

				RequestDispatcher rd = req.getRequestDispatcher("ProductDashboard.jsp");
				rd.forward(req, res);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("UserRegister.jsp");
				rd.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
