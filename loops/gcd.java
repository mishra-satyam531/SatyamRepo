package loops;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scan.nextInt();
		
		int gcd = 1;
		
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println("GCD of " + a + " and " + b + " is " + gcd);
	}

}
