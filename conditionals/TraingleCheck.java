package conditionals;

import java.util.Scanner;

public class TraingleCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first side");
		int a = scan.nextInt();
		System.out.println("Enter second side");
		int b = scan.nextInt();
		System.out.println("Enter third side");
		int c = scan.nextInt();
		
		if ((a+b)>c && (b+c)>a && (a+c)>b) {
			System.out.println("Given sides form a triangle");
		}else {
			System.out.println("Given sides does NOT form a triangle");
		}
	}

}
