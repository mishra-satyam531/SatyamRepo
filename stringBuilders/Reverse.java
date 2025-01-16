package stringBuilders;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder sb = new StringBuilder(scan.nextLine());
		
		//METHOD 1
		
//		int i = 0, j = sb.length()-1;
//		
//		while(i < j) {
//			char temp = sb.charAt(i);
//		    sb.setCharAt(i, sb.charAt(j));
//			sb.setCharAt(j, temp);
//			i++; j--;
//		}
//		
//		System.out.println(sb);
		
		// METHOD 2
		
		sb.reverse();
		System.out.println(sb);
	}

}
