package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueDemo {

	public static void main(String[] args) {


		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
			System.out.println("Is Que Empty "+que.isEmpty());
		
			//System.out.println(que.poll());
			
			for(int i=1;i<=10;i++) {
				
				que.offer(i);
				
			}
			
			System.out.println(que);
			System.out.println(que.poll());
			System.out.println(que);
			
			que.offer(11);
			System.out.println(que);
			
			for (Integer e1 : que) {
				System.out.println(e1);
			}
			
		

	}

}
