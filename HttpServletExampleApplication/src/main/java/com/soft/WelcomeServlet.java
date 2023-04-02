package com.soft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcomehttp")
public class WelcomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("Welcome to servlet prohraming  using case 2 httpservlet...");
		
	}
}
