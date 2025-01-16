package recursion;

import java.util.Scanner;

public class StairPath1or3 {
	
	public static int stair(int n) {
		if(n <= 2) return 1;
		if(n == 3) return 2;
		return stair(n - 1) + stair(n - 3);
	}

//	1 or 3 jumps
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of stairs: ");
		int n = scan.nextInt();
		
		System.out.println("Number of ways to reach at top is: " + stair(n));
	}

}
