package stringBuilders;

import java.util.Scanner;

public class SubstringContainingVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.nextLine().toLowerCase();
		
		int vowelCount = 0;
		int totalSubstrings = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(vowels(ch)) {
				vowelCount++;
			}else {
				totalSubstrings += vowelCount * (vowelCount+1)/2; //total substring = n*(n+1)/2
				vowelCount = 0;
			}
		}
		
		totalSubstrings += vowelCount * (vowelCount + 1) / 2;
		
		System.out.println("Total number of substrings that contain only vowels are: " + totalSubstrings);
	}
	
	public static boolean vowels(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

		
	}

}
