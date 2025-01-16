package loops;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i=4; i<=3*n+1; i+=3) {
			System.out.println(i);
		}
	}

}
