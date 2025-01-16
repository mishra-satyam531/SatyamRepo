package recursion;

import java.util.Scanner;

public class PrintFromNto1 {
	
	public static void print(int n) {
		if(n == 0) return;
		System.out.print(n + " ");
		print(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		print(n);

	}

}
