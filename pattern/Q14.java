package pattern;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print((char)('A' + j - 1) + " ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print((char)('A' + j - 1) + " ");
			}
			System.out.println();
		}
	}

}
