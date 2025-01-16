package loops;

import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}

}
