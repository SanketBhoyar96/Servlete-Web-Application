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

public class DB_UpdateOperation extends GenericServlet {
	
	Connection con=null;
	
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
		
		try {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.println("Working");
		
		String firstname=req.getParameter("fname");
//		String address=req.getParameter("address");
		String email = req.getParameter("email");
		
		PreparedStatement ps = con.prepareStatement("UPDATE server_testwebapp.new_table SET email=? where firstname=?");
//		ps.setString(1, address);
		ps.setString(1, email);
		ps.setString(2, firstname);
		
		int k= ps.executeUpdate();		
		if(k>0) {
			pw.println("Record Update Sucessfully Done...!");
		}else {
			pw.println("Record not Update check Again Name not match to DB...!");
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

//<label>Enter Updated Address*</label> <br>
//<input placeholder="Address" type="text" name="address"><br><br>
