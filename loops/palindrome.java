package loops;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the word: ");
		String str = scan.nextLine();
		String lstr = str.toLowerCase();
		int length = lstr.length();
		
		boolean isPalindrome = true;
		
		for (int i=0; i<length/2; i++) {
			if (lstr.charAt(i) != lstr.charAt(length-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}

	}

}
