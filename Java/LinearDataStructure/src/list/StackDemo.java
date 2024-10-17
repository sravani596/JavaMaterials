package list;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


	Stack<String>	 stack =      new Stack<String>();
	
	System.out.println("Is Empty "+stack.empty());
			stack.push("A");
			stack.push("B");
			stack.push("C");
			stack.push("D");
			
			System.out.println(stack);
			
			System.out.println("Read "+stack.peek());
			System.out.println("Delete and show "+stack.pop());
			
			System.out.println("Search "+stack.search("A"));
			
			for (String s : stack) {
			
				System.out.println(s);
				
			}
			
			System.out.println("Is Empty "+stack.empty());
	

	}

}
