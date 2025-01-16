package conditionals;

import java.util.Scanner;

public class LeastOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter second number: ");
		int b = scan.nextInt();
		System.out.println("Enter third number: ");
		int c = scan.nextInt();
		
		if(a<=b && a<=c) {
			System.out.println(a + " is least");
		}else if (b<=c) {
			System.out.println(b + " is least");
		}else {
			System.out.println(c + " is least");
		}
	}

}
