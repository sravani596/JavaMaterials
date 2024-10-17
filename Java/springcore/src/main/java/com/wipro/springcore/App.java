package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.springcore.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.wipro.springcore.*")
public class App 
{
    public static void main( String[] args )
    {
        
    	
    			
    	
    		ApplicationContext container = 	new AnnotationConfigApplicationContext(App.class);
    	
    		
    		Employee emp1 =	container.getBean(Employee.class); // get by Type
    		
    		//Employee emp2 = (Employee) container.getBean("emp");  // get by Name
    		
    		
    		System.out.println(emp1); // default values
    		
    		//System.out.println(emp2);
    		
    				emp1.setEid(101);
    				emp1.setEname("king");
    				emp1.setSalary(7000);
    				
    		System.out.println(emp1);	 // 101 king 7000	
    		
    	
    }
}
