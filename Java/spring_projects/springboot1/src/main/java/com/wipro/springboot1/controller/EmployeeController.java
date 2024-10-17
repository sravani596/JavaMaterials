package com.wipro.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot1.beans.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employee-controller")
public class EmployeeController {
	
	
			@RequestMapping(value="/hello",method = RequestMethod.GET)
			@ResponseBody  // use only for text , dont use for views  html or jsp pages
			public  String   sayHello() {
				
				
				return "Hello Friends";
			}
	
			
			
			@RequestMapping(value="/add" , method = RequestMethod.POST)
			@ResponseBody
			public  String    addEmployee(HttpServletRequest request,HttpServletResponse response) {
				
				
					
					int eid = 		Integer.parseInt(request.getParameter("eid"));
					String ename =		request.getParameter("ename");
					double salary =	Double.parseDouble(request.getParameter("salary"));
				
				Employee emp = new Employee(eid, ename, salary);
				
							// service.add(emp)
					// RequestDispatcher  --> forward or include
					
				return  "Data Added "+ emp;
			}
			
			
			@RequestMapping(value="/insert" , method = RequestMethod.POST)
			public String  insert(@ModelAttribute  Employee emp  ,HttpSession session) {
				
					session.setAttribute("emp", emp);
							
				return "success";   // it is view/page name  success.jsp
			}
			
			
			
	
	

}
