package pattern;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = scan.nextInt();
		int a = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}

}
