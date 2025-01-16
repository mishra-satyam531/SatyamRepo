package stacks;

import java.util.Stack;

public class InfixToPrefix {

	public static void main(String[] args) {
		String exp = "8-(5+3)*(4/6)";
		Stack<String> num = new Stack<>();
		Stack<Character> op = new Stack<>();
		
		int i = 0, n = exp.length(); 
		while (i < n){
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) num.push(ch + "");
			else if(ch == '(') op.push(ch);
			else if(op.isEmpty()  || op.peek() == '(') op.push(ch);
			else if(ch == ')') {
				while(op.peek() != '(') {
					char last = op.pop();
					String v1 = num.pop();
					String v2 = num.pop();
					num.push(last + v2 + v1);
				}
				op.pop();
			}
			else {
				if(ch == '+' || ch == '-') {
					char last = op.pop();
					String v1 = num.pop();
					String v2 = num.pop();
					num.push(last + v2 + v1);
					op.push(ch);
				}else if((ch == '*' || ch == '/') && (op.peek() == '*' || op.peek() == '/')){
					char last = op.pop();
					String v1 = num.pop();
					String v2 = num.pop();
					num.push(last + v2 + v1);
					op.push(ch);
				}else op.push(ch);
			}
			i++;
		}
		while(num.size() > 1){//IF OPERATORS ARE STILL REMANING
			char last = op.pop();
			String v1 = num.pop();
			String v2 = num.pop();
			num.push(last + v2 + v1);
		}
		System.out.println("Prefix form is : " + num.peek());
	}
}