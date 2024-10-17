package com.wipro.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springcore.beans.Student;
import com.wipro.springcore.dao.IStudentDao;

@Service("service")
public class StudentServiceImp implements IStudentService {
	
	
	@Autowired
	private IStudentDao dao;	
	
	
	public StudentServiceImp() {
		
		System.out.println("StudentServiceImp() obj created");
		
		
	}
	

	@Override
	public Student getService() {
		
		System.out.println("service() is called..");
	
		return   dao.getDao();
	}

}
