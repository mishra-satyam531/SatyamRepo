package stacks;

import java.util.Stack;

public class PrefixToPostfix {

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
				st.push(v1 + v2 + ch);
			}
			i--;
		}
		System.out.println("Prefix to Postfix : " + st.peek());
	}

}
