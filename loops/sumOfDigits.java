package loops;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		int original = n;
		int sum = 0;
		
		for(; n!=0; n/=10) {
			int num =n % 10;
			sum += num;
		}
		System.out.println("Sum of digits of " + original + " is " + sum);
	}

}
