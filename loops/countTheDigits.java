package loops;

import java.util.Scanner;

public class countTheDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		int original = n;
		int i=0;
		
		for(; n!=0; n /= 10) {
			i++;
		}
		System.out.println("Number of digits in " + original + " is " + i);
	}

}
