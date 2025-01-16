package stacks;

import java.util.Stack;

public class PrefixToInfix {

	public static void main(String[] args) {
		String s = "-9/*+5346";
		Stack<String> st = new Stack<>();
		int i = s.length() - 1;
		
		while(i >= 0) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) st.push(ch + "");
			else {
				String v1 = st.pop();
				String v2 = st.pop();
				st.push("(" + v1 + ch + v2 + ")");
			}
			i--;
		}
		System.out.println("Prefix to Infix : " + st.peek());
	}

}
