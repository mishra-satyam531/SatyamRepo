package recursion;

import java.util.Scanner;

public class Print1toNafterRecursiveCall {
	
	public static void print(int n) {
		if(n == 0) return; //base case
		print(n - 1); //call
		System.out.print(n + " "); //work
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		print(n);
	}

}
