package pattern;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
