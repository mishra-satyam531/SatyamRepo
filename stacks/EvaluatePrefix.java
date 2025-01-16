package stacks;

import java.util.Stack;

public class EvaluatePrefix {

	public static void main(String[] args) {
		String s = "-8/*+5376";
		Stack<Integer> st = new Stack<>();
		int n = s.length(), i = n - 1;
		
		while(i >= 0) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) st.push(ch - '0');
			else {
				int v1 = st.pop();
				int v2 = st.pop();
				if(ch == '+') st.push(v1 + v2);
				if(ch == '-') st.push(v1 - v2);
				if(ch == '*') st.push(v1 * v2);
				if(ch == '/') st.push(v1 / v2);
			}
			i--;
		}
		System.out.println("Answer after evaluation is : " + st.peek());
	}

}
