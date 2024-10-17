package com.wipro.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
    		
    		System.out.println("HelloServlet object created..");
    	
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

			System.out.println("init() is called...");
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {

				System.out.println("destroy() is called...");
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				System.out.println("service() is called...");
				
			PrintWriter  out =	response.getWriter();
			
						response.setContentType("text/html");
				
				out.print("Hello friends  <br/>");
				
				out.print(" <h1> Welcome to Servlet</h1> ");
	}

}
