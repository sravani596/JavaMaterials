package com.wipro.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/test")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			System.out.println("doGet()....");
			
				PrintWriter out =	response.getWriter();
				
						response.setContentType("text/html");
				
						out.print(" <h1  style='color:red'> Welcome to MyServlet  </h1>");
						
						
				String uname =		request.getParameter("uname");
				
				String pwd =	request.getParameter("pwd");
						
		
					out.print("welcome "+uname +"<br>");
					out.print("your password "+pwd);
					
					
					
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("doPost()....");
		
		doGet(request, response);
	}

}
