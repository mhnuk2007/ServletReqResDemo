package com.learning.srrd;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String myname = request.getParameter("name1");
		String myemail = request.getParameter("email1");
		
		System.out.println("Name: " + myname);
		System.out.println("Email: " + myemail);
		
		PrintWriter out = response.getWriter();
		out.println("Name: " + myname);
		out.println("Email: " + myemail);
		
		
		
	
		
	}

}
