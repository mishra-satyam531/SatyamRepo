package stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtAnyIndex {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter index : ");
		int idx = scan.nextInt();
		if(idx > st.size() + 1 || idx <= 0) throw new Error("Invalid index!!");
		System.out.print("Enter value : ");
		int val = scan.nextInt();
		
		Stack<Integer> revStack = new Stack<>();
		while(st.size() >= idx) { 
			revStack.push(st.pop());
		}
		
		st.push(val);
		while(revStack.size() > 0) {
			st.push(revStack.pop());
		}
		System.out.println(st);
	}

}
