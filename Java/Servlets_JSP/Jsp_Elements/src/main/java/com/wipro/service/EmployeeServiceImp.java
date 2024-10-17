package com.wipro.service;

import java.util.List;
import java.util.logging.Logger;

import com.wipro.dao.EmployeeDaoImp;
import com.wipro.dao.IEmployeeDAO;
import com.wipro.pojo.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	private IEmployeeDAO dao;
	
			
	
	
	
	

	public EmployeeServiceImp() {
		
		//logger.setLevel(Level.ALL);
		
			
			
		

		dao = new EmployeeDaoImp();

	}

	@Override
	public int addEmployee(Employee emp) {
		
		

		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {

		return dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployeeById(int eid) {
		
	

		return dao.deleteEmployeeById(eid);
	}

	@Override
	public Employee selectEmployeeById(int eid) {

		return dao.selectEmployeeById(eid);
	}

	@Override
	public List<Employee> selectAll() {

		return dao.selectAll();
	}

}
