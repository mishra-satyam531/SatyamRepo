package stringBuilders;

import java.util.Scanner;

public class InputStringBuilder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder sb = new StringBuilder(scan.nextLine());
		System.out.println(sb);
		
		sb.setCharAt(1, 'i');
		System.out.println(sb);
	}

}
