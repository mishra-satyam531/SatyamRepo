package recursion;

import java.util.Scanner;

public class PowerOf2orNot {
	
	public static boolean powerCheck(int n) {
		if(n <= 0) return false;
		if(n == 1) return true;
		if(n % 2 != 0) return false;
		return powerCheck(n / 2);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		System.out.println(powerCheck(n));
	}

}
