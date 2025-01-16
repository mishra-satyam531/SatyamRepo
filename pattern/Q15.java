package pattern;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		char ch = 'A';
		for(int i=1; i<=2*n-1; i++) {
			System.out.print(ch++ + " ");
		}
		System.out.println();
		
		for(int i=1; i<=n-1; i++) {
			ch = 'A';
			for(int j=1; j<=n-i; j++) {
				System.out.print(ch++ + " ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("  ");
				ch++;
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}
