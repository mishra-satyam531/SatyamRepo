package recursion;

import java.util.Scanner;

public class PrintFrom1toN {
//	static int n; //global variable
//	public static void print(int m) {
//		if(m > n) return; //base case
//		System.out.print(m + " "); //work
//		print(m + 1); //call
//	}
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter number: ");
//		n = scan.nextInt();
//
//		print(1);
//	}
	
//	Method 2
	public static void print(int m, int n) {
		if(m > n) return; //base case
		System.out.print(m + " "); //work
		print(m + 1, n); //call
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();

		print(1, n);
	}


}
