package stringBuilders;

import java.util.Scanner;

public class ReverseEachWord {
	
	public static void reverse(StringBuilder s, int i, int j) {
		while (i < j) {
			char temp = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, temp);
			i++; j--;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder sb = new StringBuilder(scan.nextLine());
		
		int i = 0;
		
		for (int j = 0; j < sb.length(); j++) {
			if(sb.charAt(j) == ' ') {
				reverse(sb, i, j-1);
				i = j+1;
				
			}
		}
		reverse(sb, i, sb.length()-1);
		
		System.out.println("Reversed string is: " + sb);
	}

}	
