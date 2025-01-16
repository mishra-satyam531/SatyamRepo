package pattern;

import java.util.Scanner;

public class StarPlus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter odd number of rows: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i == (n/2)+1) {
				for(int j=1; j<=n; j++) {
					System.out.print("* ");
				}
			}else {
				for(int j=1; j<=(n/2); j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
