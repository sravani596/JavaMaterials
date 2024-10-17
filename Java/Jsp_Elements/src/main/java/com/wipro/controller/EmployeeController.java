package com.wipro.controller;

import java.io.IOException;

import com.wipro.pojo.Employee;
import com.wipro.service.EmployeeServiceImp;
import com.wipro.service.IEmployeeService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
		IEmployeeService service ;
	
    public EmployeeController() {

    		service = new EmployeeServiceImp();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
			int eid =		Integer.parseInt(request.getParameter("eid"));  // "101"
									
			String ename  = 		request.getParameter("ename");
			
			double salary =			 Double.parseDouble(request.getParameter("salary"));
			
			
				//Employee emp = new Employee(eid, ename, salary);
				
				Employee emp = new Employee();
				
					emp.setEid(eid);
					emp.setEname(ename);
					emp.setSalary(salary);
				
				
					service.addEmployee(emp);
				
					HttpSession session =request.getSession();
					
							session.setAttribute("emp", emp);
				
				RequestDispatcher rd =			request.getRequestDispatcher("/views/success.jsp");
	
							rd.include(request, response);
						
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
