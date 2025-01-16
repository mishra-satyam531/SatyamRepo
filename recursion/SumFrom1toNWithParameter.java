package recursion;

import java.util.Scanner;

public class SumFrom1toNWithParameter {
	
	public static void sum(int n, int total) {
		if(n == 0) { //base case
			System.out.println(total);
			return;
		}
		sum(n-1, total+n); //call and work
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		sum(n, 0);
	}

}
