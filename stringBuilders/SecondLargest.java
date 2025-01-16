package stringBuilders;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string of characters from 0 to 9: ");
		String s = scan.nextLine();
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - '0';
			if(max < ch) {
				int temp = max;
				max = ch;
				smax = temp;
			}
			if(max > ch && smax < ch) {
				smax = ch;
			}
		}
		
		System.out.println("Second largest integer is: " + smax);
		

	}

}
