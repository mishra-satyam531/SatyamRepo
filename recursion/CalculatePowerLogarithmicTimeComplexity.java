	package recursion;

import java.util.Scanner;

public class CalculatePowerLogarithmicTimeComplexity {
	
	public static int pow(int a, int b) {
		if(b == 0) return 1;
		int ans = pow(a, b / 2);
		if(b % 2 == 0) return ans * ans;
		else return ans * ans * a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base: ");
		int a = scan.nextInt();
		System.out.print("Enter power: ");
		int b = scan.nextInt();
		
		System.out.println(pow(a, b));
	}

}
