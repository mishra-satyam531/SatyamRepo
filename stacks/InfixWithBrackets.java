package stacks;

import java.util.Stack;

public class InfixWithBrackets {

	public static void main(String[] args) {
		String exp = "9-(5+2*3+2)";
		Stack<Integer> num = new Stack<>();
		Stack<Character> op = new Stack<>();
		
		int i = 0, n = exp.length(); 
		while (i < n){
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) num.push(ch - '0');
			else if(ch == '(') op.push(ch);
			else if(op.isEmpty() || op.peek() == '(') op.push(ch);
			else if(ch == ')') {
				while(op.peek() != '(') {
					char last = op.pop();
					int v1 = num.pop();
					int v2 = num.pop();
					if(last == '+') num.push(v2 + v1);
					else if(last == '-') num.push(v2 - v1);
					else if(last == '*') num.push(v2 * v1);
					else num.push(v2 / v1);
				}
				op.pop();
			}else {
				if(ch == '+' || ch == '-') {
					char last = op.pop();
					int v1 = num.pop();
					int v2 = num.pop();
					if(last == '+') num.push(v2 + v1);
					else if(last == '-') num.push(v2 - v1);
					else if(last == '*') num.push(v2 * v1);
					else num.push(v2 / v1);
					op.push(ch);
				}else if((ch == '*' || ch == '/') && (op.peek() == '*' || op.peek() == '/')){
					char last = op.pop();
					int v1 = num.pop();
					int v2 = num.pop();
					if(last == '*') num.push(v2 * v1);
					else num.push(v2 / v1);
					op.push(ch);
				}else op.push(ch);
			}
			i++;
		}
		while(num.size() > 1) {
			char last = op.pop();
			int v1 = num.pop();
			int v2 = num.pop();
			if(last == '+') num.push(v2 + v1);
			else if(last == '-') num.push(v2 - v1);
			else if(last == '*') num.push(v2 * v1);
			else num.push(v2 / v1);
		}
		System.out.println("answer is : " + num.peek());
	}

}
