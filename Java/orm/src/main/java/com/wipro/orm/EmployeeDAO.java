package com.wipro.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.wipro.orm.entity.Employee;

public class EmployeeDAO {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();
	
	
		public  Employee    getEmployee() {
			
						//Native SQL query
				NativeQuery<Employee>  nativeQuery =		session.createNativeQuery("select * from Emp_Table where eid = 101 ",Employee.class);
			
						Employee e1 =		nativeQuery.getSingleResult();
				
							System.out.println("Record from SQL query:");
							System.out.println(e1);
			
			// HQL query  for single record
			Query<Employee> query1 = session.createQuery("select  e  from  Employee  e where e.eid = ?1 and e.ename =?2");
			
			
			
					query1.setParameter(1, 102);
					query1.setParameter(2, "tom");

			Employee emp = query1.getSingleResult();

			return emp;
			
			
		}
		
		
		public List<Employee>    getAll() {
			
			

			// HQL for all records 
			Query<Employee> query = session.createQuery("select  e  from  Employee  e ");
			
			
						
			
			 List<Employee> list = query.getResultList();
			
			 return list;
			
			
		}
		
		
		// NamedQuery 
		
		public List<Employee>  getAllEmployees(){
			
			
			Query<Employee>  query =			session.createNamedQuery("getAllEmployees");
			
				List<Employee> list =	query.getResultList();
				
				return list;
			
		}
		
		
		
		public List<Employee>  getSorted(){
			
			Query<Employee>  query =	session.createNamedQuery("getSorted");
			
			
			List<Employee> list =	query.getResultList();
			
			return list;
			
		}
		
		
		public   void  deleteByEname(String ename) {
			
			
			Transaction tr =	session.beginTransaction();
			
						
			Query  query =			session.createQuery("delete from Employee e  where e.ename =?1");
						
						query.setParameter(1, ename);
						
			int  count =	query.executeUpdate();
			
				System.out.println(count +"record deleted..");
			
			tr.commit();
		
			
		
		
	}

		
		
	
	

}
