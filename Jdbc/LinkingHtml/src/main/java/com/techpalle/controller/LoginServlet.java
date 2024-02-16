package com.techpalle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		long phone = Long.parseLong(request.getParameter("phone"));
		String[] courses = request.getParameterValues("course");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<h2>"+userName+"</h2></br>");
		writer.print("<h2>"+email+"</h2></br>");
		writer.print("<h2>"+age+"</h2></br>");
		writer.print("<h2>"+phone+"</h2></br>");
		writer.print("<h2>"+Arrays.toString(courses)+"</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
