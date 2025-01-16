package recursion;

import java.util.Scanner;

public class SumFrom1toNwithReturnType {
	
	public static int sum(int n) {
		if(n == 0) return 0;
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		System.out.println(sum(n));
	}

}
