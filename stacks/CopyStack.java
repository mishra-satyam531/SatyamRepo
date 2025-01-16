package stacks;

import java.util.Stack;

public class CopyStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		
		Stack<Integer> revStack = new Stack<>();
		while(st.size() > 0) {
			revStack.push(st.pop());
		}
		System.out.println(revStack);
		
		Stack<Integer> copy = new Stack<>();
		while(revStack.size() > 0) {
			copy.push(revStack.pop());
		}
		System.out.println("Copied stack is : " + copy);
	}
}
