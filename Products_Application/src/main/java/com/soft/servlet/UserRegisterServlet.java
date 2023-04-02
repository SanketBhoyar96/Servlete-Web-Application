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

import com.mysql.cj.xdevapi.PreparableStatement;
import com.soft.dao.DBConnection;

@WebServlet("/register")
public class UserRegisterServlet extends GenericServlet {

	Connection con=null;
	
	public void init() {
		DBConnection dbcon= new DBConnection();
		con = dbcon.creatConnection();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
             try {
            	 
            	 PrintWriter pw = res.getWriter();
            	 res.setContentType("text/html");
            	 
            	 int ID= Integer.parseInt(req.getParameter("id"));
            	 String Name=req.getParameter("fname");
            	 long Contact= Integer.parseInt(req.getParameter("contact"));
            	 String Address= req.getParameter("address");
            	 String Email= req.getParameter("email");
            	 String Password= req.getParameter("password");
            	 
            	 PreparedStatement ps = con.prepareStatement("INSERT INTO product_application.userdata values(?,?,?,?,?,?)");
            	 ps.setInt(1, ID);
            	 ps.setString(2, Name);
            	 ps.setLong(3, Contact);
            	 ps.setString(4, Address);
            	 ps.setString(5, Email);
            	 ps.setString(6, Password);
            	 
            	 int k = ps.executeUpdate();
            	 if(k>0) {
            		 pw.println("Record Insert DB  Sucessfully done..!!");
            		 
            		 RequestDispatcher rd = req.getRequestDispatcher("UserLogin.jsp");
            		 rd.forward(req, res);
            	 }else {
            		 pw.println("Record Not Insert DB");
            		 RequestDispatcher rd = req.getRequestDispatcher("UserRegister.jsp");
            		 rd.forward(req, res);
            	 }
            	 
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void destroy() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
