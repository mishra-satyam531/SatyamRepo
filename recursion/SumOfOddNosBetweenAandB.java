package recursion;

import java.util.Scanner;

public class SumOfOddNosBetweenAandB {
	
	public static void print(int a, int b, int sum) {
		if(a > b) {
			System.out.println(sum);
			return;
		}
		
		if(a % 2 != 0) sum += a;
		print(a + 1, b, sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		System.out.print("Enter second number: ");
		int b = scan.nextInt();
		
		print(a, b, 0);
	}

}
