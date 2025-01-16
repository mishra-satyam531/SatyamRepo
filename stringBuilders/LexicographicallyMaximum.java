package stringBuilders;

import java.util.Scanner;

public class LexicographicallyMaximum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		
		String[] words = s.split("\\s+");
//		The \\s is a regular expression that matches any whitespace character.
//		The + in regular expressions means "one or more occurrences" of the preceding element.
//		So, \\s+ means "one or more whitespace characters".
		
		String maxWord = words[0];
		
		for (int i = 1; i < words.length; i++) {
			if(words[i].compareTo(maxWord) > 0) {
//				compareTo() returns:
//				0 if the two strings are equal.
//				A positive number if the string calling compareTo() is lexicographically greater than the argument string.
//				A negative number if the string calling compareTo() is lexicographically less than the argument string.
				maxWord = words[i];
			}
		}
		
		System.out.println("Lexographically maximum word is: " + maxWord);
	}

}
