package stacks;

import java.util.Stack;

public class Basic {
//	STACK FOLLOWS LIFO PRINCIPLE (LAST IN, FIRST OUT)
//	1-BASED INDEXING IN STACKS
	public static void main(String[] args) {
		Stack <Integer> st = new Stack<>();
		System.out.println("Is stack empty : " + st.isEmpty());
		st.push(1);
		st.push(5);
		System.out.println("Pushed element is : " + st.push(10)); //WILL PRINT ELEMENT AS WELL ALONGWITH INSERTION
		System.out.println("Stack is : " + st);
		System.out.println("Last element is : " + st.peek());
		System.out.println("Removed element is : " + st.pop());
		System.out.println("Stack is : " + st);
		System.out.println("Size is : " + st.size());
		System.out.println("Is stack empty : " + st.isEmpty());
		st.push(2);
		st.push(3);
		System.out.println("Stack is : " + st);
		
//		ACCESSING FIRST ELEEMNT
		while(st.size() > 1) {
			st.pop();
		}
		System.out.println("First eleemt is : " + st.peek());
//		HENCE TIME COMPLEXITY TO ACCESS FIRST ELEMENT IS O(n)
	}

}
