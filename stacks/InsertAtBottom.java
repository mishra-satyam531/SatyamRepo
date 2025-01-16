package stacks;

import java.util.Stack;

public class InsertAtBottom {

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
		
		Stack<Integer> stFinal = new Stack<>();
		stFinal.push(0);
		while(revStack.size() > 0) {
			stFinal.push(revStack.pop());
		}
		System.out.println("Updated list is : " + stFinal);
	}

}
