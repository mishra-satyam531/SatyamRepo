package stringBuilders;

import java.util.Scanner;

public class ReverseHalfString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string of even length: ");
		StringBuilder s = new StringBuilder(scan.nextLine());
		int len = s.length();
		
		if(len %2 != 0) System.out.println("INVALID STRING");
		else {
			int i = len/2, j = len-1;
			while(i < j) {
				char temp = s.charAt(i);
				s.setCharAt(i, s.charAt(j));
				s.setCharAt(j, temp);
				i++; j--;
			}
			System.out.println(s);
		}
	}

}
