package loops;

import java.util.Scanner;

public class GP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		
		int a = 3, r = 4;
		for (int i=1; i<=n; i++) {
			System.out.println(a);
			a *= r;
		}
	}

}
