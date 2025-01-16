package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {

	public static void main(String[] args) {
//		QUEUE FOLLOWS FIFO PRINCIPLE
//		Queue<Integer> que = new ArrayDeque<>(); //M1
		Queue<Integer> que = new LinkedList<>(); //M2
//		ADD OR PUSH OPERATION IN QUEUE
		que.add(10); //ELEMENT ENTERS FROM REAR SIDE
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		System.out.println(que);
		que.remove(); //ELEMENT REMOVES FROM FRONT AND THROWS EXCEPTION WHEN QUEUE IS EMPTY
		System.out.println(que);
		que.poll(); //ELEMENT REMOVES FROM FRONT BUT DOES NOT THROW EXCEPTION WHEN QUEUE IS EMPTY
		System.out.println(que);
		System.out.println(que.peek()); //FIRST ELEMENT FROM FRONT
		System.out.println(que.size());
		System.out.println(que.isEmpty());
	}

}
