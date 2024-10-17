package com.wipro.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out =		response.getWriter();
			
					response.setContentType("text/html");
					
					out.print("<h1>Welcome to Customer Servlet</h1>");
					
					String username = "javeed";
					double  amount = 45000;
			//request object
					//request.setAttribute("uname", username);
					//request.setAttribute("amount", amount);
			
					
     // application object
		          //ServletContext  application =			request.getServletContext(); // context obj or application obj
					
					//application.setAttribute("uname", username);
					//application.setAttribute("amount", amount);
		
					HttpSession session =		request.getSession();
		
							session.setAttribute("uname", username);
							session.setAttribute("amount", amount);
					
					
				RequestDispatcher rd =	request.getRequestDispatcher("/PaymentServlet"); // servlet mapping, jsp page,html page
		
						//rd.include(request, response);
				
					//rd.forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
