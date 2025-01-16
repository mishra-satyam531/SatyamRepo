package methods;

import java.util.Scanner;

public class squareOfNumbers {
	
	public static void printSquares(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(i*i);
		}
	}

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number upto which you want to calculate square");
		int n = scan.nextInt();
		
		printSquares(n);
		
	}

}
