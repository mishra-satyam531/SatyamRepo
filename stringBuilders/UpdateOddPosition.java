package stringBuilders;

import java.util.Scanner;

public class UpdateOddPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder s = new StringBuilder(scan.nextLine());
		
		for (int i = 0; i < s.length(); i++) {
			if(i%2 != 0) s.setCharAt(i, '#');
		}
		
		System.out.println(s);
	}

}
