package methods;

import java.util.Scanner;

public class Odd {
	
	public static void printOdd(int x, int y) {
		for(int i=x+1; i<y; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		
		System.out.print("Enter second number: ");
		int b = scan.nextInt();
		
		printOdd(a, b);
	}

}
