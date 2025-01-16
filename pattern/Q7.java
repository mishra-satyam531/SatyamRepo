package pattern;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
