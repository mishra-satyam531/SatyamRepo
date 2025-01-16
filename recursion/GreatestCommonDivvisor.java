package recursion;

import java.util.Scanner;

public class GreatestCommonDivvisor {
	
	public static void gcd(int a, int b) {
		if(a == 0) {
			System.out.println(b);
			return;
		}
		gcd(b % a, a);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		System.out.print("Enter second number: ");
		int b = scan.nextInt();
		
		gcd(a, b);
	}

}
