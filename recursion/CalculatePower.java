package recursion;

import java.util.Scanner;

public class CalculatePower {
	
	public static int pow(int a, int b) {
		if(b == 0) return 1;
		return a * pow(a, b - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base: ");
		int a = scan.nextInt();
		System.out.print("Enter power: ");
		int b = scan.nextInt();

		System.out.println(pow(a, b));
		
//		TC = O(b)
	}

}
