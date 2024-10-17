package com.wipro.ems.presentation;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.wipro.ems.exceptions.EmployeeNotFoundException;
import com.wipro.ems.pojo.Employee;
import com.wipro.ems.service.EmployeeServiceImp;
import com.wipro.ems.service.IEmployeeService;

public class Client {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		Logger logger = Logger.getLogger(Client.class);

		//logger.setLevel(Level.INFO);

		IEmployeeService service = new EmployeeServiceImp();

		boolean flag = true;

		logger.info("EMS Application started");

		System.out.println("******* WELCOME TO EMS *******");

		while (flag) {

			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. UPDATE EMPLOYEE");

			System.out.println("3. DELETE  EMPLOYEE BY ID");
			System.out.println("4. DISPLAY  EMPLOYEE BY ID");

			System.out.println("5. DISPLAY ALL  EMPLOYEES");

			System.out.println("6. EXIT ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				logger.info("Add option selected");

				Employee emp = getEmployee();

				// addEmp() from service

				int count1 = service.addEmployee(emp);

				if (count1 > 0) {

					System.out.println("Employee Added Successfully...");

				}

				else {

					System.err.println("Add Failed...");

				}

				break;

			case 2:
				Employee emp1 = getEmployee();

				// service.updateEmployee(emp1);

				break;

			case 3:

				System.out.println("Enter Eid to delete record");

				int eid = scanner.nextInt();

				int count2 = service.deleteEmployeeById(eid);

				if (count2 > 0) {

					System.out.println("Employee Deleted Successfully...");

				}

				else {

					try {
						logger.error("Delete Failed Error occur");

						throw new EmployeeNotFoundException();

					} catch (EmployeeNotFoundException e) {

						// e.printStackTrace();
						System.out.println("Delete Failed");
						System.err.println("Sorry! Employee Not Found for Eid " + eid);

					}

				}

				break;

			case 4:

				System.out.println("Enter Eid to search record");

				int eid1 = scanner.nextInt();

				Employee employee = service.selectEmployeeById(eid1);

				if (employee != null) {

					System.out.println(employee);

				} else {

					try {
						throw new EmployeeNotFoundException();
					} catch (EmployeeNotFoundException e) {

						// e.printStackTrace();

						System.err.println("Sorry! Employee Not Found for Eid " + eid1);

					}

				}

				break;

			case 5:

				List<Employee> list = service.selectAll();

				list.forEach((e1) -> {
					System.out.println(e1);
				});

				break;

			case 6:

				flag = false;

				System.out.println("Thank you visit again..");

				break;

			default:

				System.err.println("Invalid Option");

				break;
			}

		}

	}

	public static Employee getEmployee() { // reading data from K.B

		System.out.println("Enter Eid ");
		int eid = scanner.nextInt();

		scanner.nextLine(); // to control enter key

		System.out.println("Enter EName ");
		String ename = scanner.nextLine();

		System.out.println("Enter Salary");
		double salary = scanner.nextDouble();

		Employee emp = new Employee(eid, ename, salary);

		return emp;

	}

}
