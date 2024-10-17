

package instance;

public class Employee { // pojo class or entity class
	private   int eid;  // declare eid,ename ,salary as static 
	private   String ename;    // Data Hiding or Encapsulation
	private  double salary;
	
	public  Employee() {
		super();  // Object();
		
	}

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	
	
	
	@Deprecated
	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	
	
	
	

}
