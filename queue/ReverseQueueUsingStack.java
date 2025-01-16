package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
	static Queue<Integer> que;
	
	public static void reverseQueue() {
		Stack<Integer> st = new Stack<Integer>();
//		Transfer elements from the queue to the stack
		while(!que.isEmpty()) {
			st.push(que.poll());
		}
		
//		Transfer elements back from the stack to the queue
		while(!st.isEmpty()) {
			que.add(st.pop());
		}
	}
	
	public static void main(String[] args) {
		que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		System.out.println("Queue is : " + que);
		
		reverseQueue();
		
		System.out.println("Reverse queue : " + que);
	}

}
