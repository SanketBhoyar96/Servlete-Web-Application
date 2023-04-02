package com.soft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.soft.dao.DBConnection;

@WebServlet("/addpro")
public class AddProductServlet extends GenericServlet {
	private Connection con;
    
	public void init() {
		DBConnection dbcon = new DBConnection();
		con=dbcon.creatConnection();
		}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		try {
		int ProductID = Integer.parseInt(req.getParameter("pid"));
		String ProductName = req.getParameter("pname");
		int ProductQTY = Integer.parseInt(req.getParameter("pqty"));
		double ProductPrice= Integer.parseInt(req.getParameter("pprice"));
		
		PreparedStatement ps = con.prepareStatement("INSERT into product_application.prouduct values(?,?,?,?)");
		ps.setInt(1, ProductID);
		ps.setString(2, ProductName);
		ps.setInt(3, ProductQTY);
		ps.setDouble(4, ProductPrice);
		
		int k=ps.executeUpdate();
		
		if(k>0) {
			RequestDispatcher rd = req.getRequestDispatcher("ProductDashboard.jsp");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("ProductError.jsp");
			rd.forward(req, res);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
