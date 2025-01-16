package conditionals;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first side: ");
		int a = scan.nextInt();
		System.out.println("Enter second side: ");
		int b = scan.nextInt();
		System.out.println("Enter third side: ");
		int c = scan.nextInt();
		
		if ((a==b) && (b==c)) {
			System.out.println("Equilateral triangle");
		}else if ((a!=b) && (b!=c) && (a!=c)) {
			System.out.println("Scalene triangle");
		}else {
			System.out.println("Isosceles triangle");
		}
	}

}
