package conditionals;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter operator: ");
		char op = scan.next().charAt(0);
		System.out.println("Enter second number");
		int b = scan.nextInt();
		
		switch (op) {
		    case '+' :
		    	System.out.println(a+b);
		    	break;
		    case '-' :
		    	System.out.println(a-b);
		    	break;
		    case '*' :
		    	System.out.println(a*b);
		    	break;
		    case '/' :
		    	System.out.println(a/b);
		    	break;
		    default :
		    	System.out.println("Invalid operator");

		}
	}

}
