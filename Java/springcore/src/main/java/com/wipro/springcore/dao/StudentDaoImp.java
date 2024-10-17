package com.wipro.springcore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.springcore.beans.Student;

@Repository
public class StudentDaoImp implements IStudentDao {

	
	@Autowired
	private Student student; // DI or Autowiring
	
	
	
	
	
	public StudentDaoImp() {
		
		System.out.println("StudentDaoImp() obj created");
		
		
		
	}
	
	

	@Override
	public Student getDao() {

		System.out.println("dao method called after getting  student obj");
		
		System.out.println(student);
		
		return student;
	}

}
