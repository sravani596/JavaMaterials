package com.wipro.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wipro.springboot1.beans.Employee;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
	
		
		
	ApplicationContext context =	SpringApplication.run(Springboot1Application.class, args);
	
			Employee e1 =	context.getBean("e1",Employee.class);
	
				System.out.println(e1);
			
	}

}


 