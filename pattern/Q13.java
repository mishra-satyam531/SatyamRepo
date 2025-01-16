package pattern;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}
