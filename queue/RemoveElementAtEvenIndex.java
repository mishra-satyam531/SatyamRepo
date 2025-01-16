package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveElementAtEvenIndex {

	public static void main(String[] args) {
		Queue<Integer> que = new ArrayDeque<Integer>();
		Queue<Integer> helper = new ArrayDeque<Integer>();
		
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		while(!que.isEmpty()) {
			que.poll();
			if(!que.isEmpty()) {
				System.out.print(que.peek() + " ");
				helper.add(que.poll());
			}
		}
		
		while(!helper.isEmpty()) {
			que.add(helper.poll());
		}
	}

}
