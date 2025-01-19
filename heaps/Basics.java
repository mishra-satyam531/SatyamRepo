package heaps;

import java.util.Collections;
import java.util.PriorityQueue;


public class Basics {

	public static void main(String[] args) {
//		MIN HEAP	
		PriorityQueue<Integer> 	pq = new PriorityQueue<>();
		pq.add(2); //TC : O(logn);
		System.out.println(pq + " " + pq.peek()); //peek TC : O(1)
		pq.add(10);
		System.out.println(pq + " " + pq.peek());
		pq.add(1);
		System.out.println(pq + " " + pq.peek());
		pq.remove(); //TC : O(logn)
		System.out.println(pq + " " + pq.peek());
		pq.add(0);
		System.out.println(pq + " " + pq.peek());
		pq.add(-34);
		System.out.println(pq + " " + pq.peek());
		System.out.println(pq.size()); // size TC : O(1)
		
//		MAX HEAP
		System.out.println("---------------------------------------------------------");
		PriorityQueue<Integer> 	pqu = new PriorityQueue<>(Collections.reverseOrder());
		pqu.add(2); //TC : O(logn);
		System.out.println(pqu + " " + pqu.peek()); //peek TC : O(1)
		pqu.add(10);
		System.out.println(pqu + " " + pqu.peek());
		pqu.add(1);
		System.out.println(pqu + " " + pqu.peek());
		pqu.remove(); //TC : O(logn)
		System.out.println(pqu + " " + pqu.peek());
		pqu.add(0);
		System.out.println(pqu + " " + pqu.peek());
		pqu.add(-34);
		System.out.println(pqu + " " + pqu.peek());
		System.out.println(pqu.size()); // size TC : O(1)
	
	}
}	