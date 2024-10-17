package com.wipro.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wipro.orm.entity.Employee;

public class HQL_Demo {

	public static void main(String[] args) {

		
		
		
		
		
		
		EmployeeDAO dao = new EmployeeDAO();
			
			Employee emp =	dao.getEmployee();
			
			System.out.println(emp);

			
			List<Employee>  list=	dao.getAll();
			
		 
		 for (Employee employee : list) {
			 
			 System.out.println(employee);
			
		}
		 
		 
		 System.out.println("Result from Named query");
		 
		 
		 List<Employee>  list2 = dao.getAllEmployees();
		 
		 	list2.forEach(System.out::println);
		 
		 
		 		
		 		System.out.println("Sorted Data from named query");
		 		
		 				dao.getSorted().forEach(System.out::println);
		 				
		 				
		 			
		 				
		 				dao.deleteByEname("raju");
		 	
		 

	}

}
