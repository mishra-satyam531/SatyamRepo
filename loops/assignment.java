package loops;

import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println("Sum upto " + n + " is " + sum);
	} 

}
