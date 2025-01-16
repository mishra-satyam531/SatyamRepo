package stacks;

import java.util.Stack;

public class EvaluatePostfix {
	public static void main(String[] args) {
		String s = "953+4*6/-";
		Stack<Integer> st = new Stack<>();
		
		int i = 0, n = s.length();
		while(i < n) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) st.push(ch - '0');
			else {
				int v1 = st.pop();
				int v2 = st.pop();
				if(ch == '+') st.push(v2 + v1);
				if(ch == '-') st.push(v2 - v1);
				if(ch == '*') st.push(v2 * v1);
				if(ch == '/') st.push(v2 / v1);
			}
			i++;
		}
		System.out.println("Answer after evaluation is : " + st.peek());
	}
}
