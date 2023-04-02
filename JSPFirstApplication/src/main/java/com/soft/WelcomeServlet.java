package com.soft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class WelcomeServlet extends HttpServlet{
	
	 protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		 PrintWriter pw =res.getWriter();
	      res.setContentType("text/html");
	      
	      String str = "Sanket Bhoyar";
	      
	      req.setAttribute("name", str);
	      
	      RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
	      rd.forward(req, res);
	 }

}
