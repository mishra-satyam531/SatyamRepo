package pattern;

import java.util.Scanner;

public class NumberBridge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=2*n-1; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1; i<=n-1; i++) {
			int a = 1;
			for(int j=1; j<=n-i; j++) {
				System.out.print(a++ + " ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("  ");
				a++;
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

}