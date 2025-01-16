package recursion;

import java.util.Scanner;

public class Stair1or2or3Steps {
	
	public static int stairs(int n) {
		if(n <= 1) return 1;
		if(n == 2) return 2;
		if(n <= 3) return 4;
		return stairs(n - 1) + stairs(n - 2) + stairs(n - 3);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of stairs: ");
		int n = scan.nextInt();
		System.out.println(stairs(n));
	}

}
