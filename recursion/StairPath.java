package recursion;

import java.util.Scanner;

public class StairPath {
	
//	1 or 2 jumps
	public static int stair(int n) {
		if(n <= 2) return n;
		return stair(n - 1) + stair(n - 2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of stairs: ");
		int n = scan.nextInt();
		
		System.out.println("Total number of ways to reach at the top is " + stair(n));
	}

}
