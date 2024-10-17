package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.springcore.beans.Student;
import com.wipro.springcore.service.StudentServiceImp;

@Configuration
@ComponentScan(basePackages = "com.wipro.springcore.*")
public class Client {
	
	

		//@Autowired
	//	IStudentService service;
	
	public static void main(String[] args) {
		
		
		ApplicationContext container = 	new AnnotationConfigApplicationContext(Client.class);
		
		
		StudentServiceImp service =			container.getBean(StudentServiceImp.class);
		
		
			service.getService();
		
	}
	
		@Bean
	 public Student  getObj() {
		 
		 
		 
		 return new Student(121,"javeed");
	 }
	
	
	

}
