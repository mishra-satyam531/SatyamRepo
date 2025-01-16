package recursion;

import java.util.Scanner;

public class FbonacciNumber {
	
	public static int fibo(int n) {
		if(n <= 1) return n;
		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		System.out.println(fibo(n));
	}

}
