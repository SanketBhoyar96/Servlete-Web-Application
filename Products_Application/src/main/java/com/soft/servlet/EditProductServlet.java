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

@WebServlet("/editProduct")
public class EditProductServlet extends GenericServlet {
	
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
			double ProductPrice = Integer.parseInt(req.getParameter("pprice"));
			PreparedStatement ps = con.prepareStatement("UPDATE product_application.prouduct SET ProductName=?,ProductQTY=?,ProductPrice=? where ProductID=?");
			ps.setString(1, ProductName);
			ps.setInt(2, ProductQTY);
			ps.setDouble(3, ProductPrice);
			ps.setInt(4, ProductID);
			
			int k= ps.executeUpdate();
			
			if(k>0) {
				pw.print("Product Update Sucessfully");
				RequestDispatcher rd = req.getRequestDispatcher("ProductDashboard.jsp");
				rd.include(req, res);
			}else {
				pw.print("Product NOT Update Sucessfully");
				RequestDispatcher rd = req.getRequestDispatcher("EditProduct.jsp");
				rd.include(req, res);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
