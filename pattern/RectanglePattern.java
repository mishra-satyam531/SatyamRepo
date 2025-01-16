package pattern;

import java.util.Scanner;

public class RectanglePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int r = scan.nextInt();
		System.out.println("Enter number of columns: ");
		int c = scan.nextInt();
		
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
