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

@WebServlet("/deleteProduct")
public class DeleteProductServlet extends GenericServlet {
	
	private Connection con;
	public void init() {
		DBConnection dbcon = new DBConnection();
		con=dbcon.creatConnection();
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		try {
			int ProductID = Integer.parseInt(req.getParameter("pid"));
		     
			PreparedStatement ps = con.prepareStatement("DELETE FROM product_application.prouduct where ProductID=?");
			ps.setInt(1, ProductID);
			
			int k= ps.executeUpdate();
			
			if(k>0) {
				pw.print("Record Deleted Sucessfully");
				RequestDispatcher rd = req.getRequestDispatcher("ProductDashboard.jsp");
				rd.include(req, res);
			}else {
				pw.print("Record NOT Deleted Sucessfully");
				RequestDispatcher rd = req.getRequestDispatcher("ProductDashboard.jsp");
				rd.include(req, res);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
