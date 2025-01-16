package pattern;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		char ch = 'A';
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
		}
	}

}
