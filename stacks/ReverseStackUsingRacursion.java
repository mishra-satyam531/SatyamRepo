package stacks;

import java.util.Stack;

public class ReverseStackUsingRacursion {
	
	public static void reverse(Stack<Integer> st) {
		if(st.size() == 0) return;
		int d = st.pop();
		System.out.print(d + " ");
		reverse(st);
		st.push(d); //RESTORING STACK VALUES AGAIN
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		
		reverse(st);
	}

}
