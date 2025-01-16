package pattern;

import java.util.Scanner;

public class NumberPyramidPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n-1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i+1; j++) {
				System.out.print(j + " ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
