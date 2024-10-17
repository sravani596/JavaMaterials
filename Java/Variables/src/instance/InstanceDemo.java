package instance;

public class InstanceDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "king", 50000);

		System.out.println(e1);

		System.out.println(e1.getEid());
		System.out.println(e1.getEname());

		Employee e2 = new Employee();
			e2.setEid(102);
			e2.setEname("javeed");
			e2.setSalary(70000);

		System.out.println(e2);
		
		System.out.println(e1);
		
		@SuppressWarnings("unused")
		int x = 99;


	}

}
