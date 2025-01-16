package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of terms: ");
		int n = scan.nextInt();
		
		if(n<1) {
			System.out.println("Please enter a positive integer.");
		}else {
			int firstTerm = 0;
			int secondTerm = 1;
			
			System.out.print("Fibonacci series: " + firstTerm);
			
			if(n>1) {
				System.out.print(", " + secondTerm);
			}
			for(int i=3; i<=n; i++) {
				int nextTerm = firstTerm + secondTerm;
				System.out.print(", " + nextTerm);
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
		}
		
	}

}
