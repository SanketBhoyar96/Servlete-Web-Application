package com.soft;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DB_DeleteOperation  extends GenericServlet{
	Connection con = null;
	

	public void init() {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server_testwebapp","root","Sanket@123");
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String firstname=req.getParameter("fname");
//		String lasttname=req.getParameter("lname");
//		String address=req.getParameter("address");
//		String email=req.getParameter("email");
		
//		pw.println("DB_DeleteOperation worked");
		pw.println(firstname);
//		pw.println(lasttname);
//		pw.println(address);
//		pw.println(email);
		
		PreparedStatement ps = con.prepareStatement("Delete from server_testwebapp.new_table where firstname=?");
		 ps.setString(1, firstname);
		 
		 int k=ps.executeUpdate();
		 if(k>0) {
			 pw.println("Deletes Sucessfully in DB Record...!!");
		 }else {
		    pw.println("Not delete to be DB check again Name");
		 }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Destroy() {
		
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
