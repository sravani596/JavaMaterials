package com.wipro.restapi.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.datajpa.entity.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

	
		public Employee  findByEname(String ename);
		
		public List<Employee>  findBySalaryGreaterThan(double salary);
		
		
		
		
		@Query("select e  from Employee e where e.salary > ?1 order by e.salary")
		public List<Employee>  findAllSorted(double salary);
		
		
		@Modifying // only for DML Queries
		@Query("delete from Employee e where e.ename = ?1")
		public void   deleteByEname(String ename);
		
	
}
