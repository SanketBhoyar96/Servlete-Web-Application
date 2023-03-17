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

import com.mysql.cj.xdevapi.PreparableStatement;

public class JDBCconnection extends GenericServlet {

	Connection con = null;

	public void init() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server_testwebapp", "root", "Sanket@123");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		try {

			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");

			String firstName = req.getParameter("fname");
			String lastName = req.getParameter("lname");
			String address = req.getParameter("address");
			String email = req.getParameter("email");

			PreparedStatement ps = con.prepareStatement("INSERT INTO server_testwebapp.new_table values(?,?,?,?)");
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, address);
			ps.setString(4, email);
			
			int k= ps.executeUpdate();
			if(k>0) {
				pw.println("Data Inserted into DB SucessFully...!!");
			}else {
				pw.println("Data Not Inserted into DB TRY Again...!!");
			}
//		pw.println(firstName);/pw.println(lastName);//pw.println(address);//pw.println(email);
		} catch (Exception e) {
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
