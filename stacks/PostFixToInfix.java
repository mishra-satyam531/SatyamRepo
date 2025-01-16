package stacks;

import java.util.Stack;

public class PostFixToInfix {

	public static void main(String[] args) {
		String s = "953+4*6/-";
		Stack<String> st = new Stack<>();
		int n = s.length(), i = 0;
		
		while(i < n) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) st.push(ch + "");
			else {
				String v1 = st.pop();
				String v2 = st.pop();
				st.push("(" + v2 + ch + v1 + ")");
			}
			i++;
		}
		System.out.println("Prefix to Infix : " + st.peek());
	}

}
