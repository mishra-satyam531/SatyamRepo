package pattern;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
