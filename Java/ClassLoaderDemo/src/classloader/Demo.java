package classloader;

public class Demo {

	public static void main(String[] args) {


				Class c = Demo.class;
				
				System.out.println(c);
				
				System.out.println(c.getClassLoader());
				
				Class c1 =		String.class;

					System.out.println(c1.getClassLoader());
				
	}

}
