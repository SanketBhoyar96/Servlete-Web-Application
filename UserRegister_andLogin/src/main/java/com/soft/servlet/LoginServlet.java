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

import com.soft.dao.DBConnection;

public class LoginServlet extends GenericServlet {

	Connection con = null;

	public void init() {
		DBConnection dbcon = new DBConnection();
		con = dbcon.createConnection();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");

			String userEmail = req.getParameter("userEmail");
			String Password = req.getParameter("userPassword");
			PreparedStatement ps = con
					.prepareStatement("select * from user_detailsdb.user where userEmail=? and Password=?");
			
			ps.setString(1, userEmail);
			ps.setString(2, Password);
			
			ResultSet rs = ps.executeQuery();
			
           
			if(rs.next()) {
				pw.println("User login sucessfully..");
				pw.println("Welcome::"+rs.getString(2));
//				
				req.setAttribute("userName", rs.getString(2));
				req.setAttribute("userEmail", rs.getString(3));
				
//				  req.removeAttribute("userName");
				
				                           
				RequestDispatcher rd = req.getRequestDispatcher("/test");    //servlet to servlet
//				rd.forward(req, res);  //without loginservlet response
				rd.include(req, res);   // with login dervlet response
//				------------------------------------------------------------------------------------
//				RequestDispatcher rd= req.getRequestDispatcher("dashboard.html");  //servlet to html 
//				rd.forward(req, res);
			}else {
				pw.println("User not login sucessfully..");
				RequestDispatcher rd = req.getRequestDispatcher("register.html");
				rd.forward(req, res);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
