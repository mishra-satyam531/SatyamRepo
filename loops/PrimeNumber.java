package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		
		if(n<2) {
			System.out.println("NOT a prime");
		}else if(n==2){
			System.out.println("Prime");
		}else {
			boolean isPrime = true;
			for (int i=2; i<=Math.sqrt(n); i++) {
				if(n%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Prime");
			
			}else {
				System.out.println("NOT a prime");
			}
			
		}
	}

}
