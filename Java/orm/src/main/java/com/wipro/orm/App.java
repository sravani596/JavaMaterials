package com.wipro.orm;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.orm.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		// DML - INSERT, UPDATE , DELETE transaction is mandatory

		// DRL- SELECT QUERIES transaction is optional

		Transaction tr = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEid(105);
		emp.setEname("raju");
		emp.setSalary(15000);

		 Serializable ser = session.save(emp); // save() insert record into DB

		 System.out.println(ser.toString() + " record inserted");

		// session.update(emp); // update() update record into DB

		/*
		 * Employee e1 = session.find(Employee.class, 121);
		 * 
		 * System.out.println(e1);
		 * 
		 * session.delete(e1);
		 */

		tr.commit();

	}
}
