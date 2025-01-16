package stringBuilders;

import java.util.Scanner;

public class CountConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder s = new StringBuilder(scan.nextLine());
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(consonants(s.charAt(i)) && Character.isLetter(s.charAt(i))) count++;
//			Charcater.isLetter(char ch) used to check A-Z or a-z
//			Character.isDigit(char ch) used to check 1-9
//			Character.isWhitespace(char ch) used to check space,tab,newline..
//			Character.isUpperCase(char ch) or lowercase
//			Character.toUpperCase(char ch) or lowercase to convert
		}
		
		System.out.println("Number of consonants are: " + count);
	}
	
	public static boolean consonants(char s) {
		if(s == 'A' || s == 'a' || s == 'E' || s == 'e' || s == 'I' || s == 'i' || s == 'O' || s == 'o' || s == 'U' || s == 'u') {
			return false;
		}
		return true;
	}

}
