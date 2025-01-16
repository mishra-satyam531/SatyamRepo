package conditionals;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int m = scan.nextInt();
		
		if (m>=81) {
			System.out.println("Very Good");
		}else if (m>=61) {
			System.out.println("Good");
		}else if (m>=41) {
			System.out.println("Average");
		}else {
			System.out.println("FAIL");
		}
	}

}
