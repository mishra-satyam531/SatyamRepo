package stringBuilders;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		boolean flag = true;
		
		String t = s.toLowerCase();
		
		int i = 0, j = s.length()-1;
		while(i < j) {
			if(t.charAt(i)!= t.charAt(j)) {
				flag = false;
				break;
			}
			i++; j--;
		}
		
		if(flag) System.out.println("String is a palindrome");
		else System.out.println("String is not a palindrome");
	}

}
