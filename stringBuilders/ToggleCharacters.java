package stringBuilders;

import java.util.Scanner;

public class ToggleCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		StringBuilder sb = new StringBuilder(s);
		
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			int ascii = (int)ch;
			if(ascii <= 90 && ascii >=65) {
				sb.setCharAt(i, (char)(ascii+32));
			}
			else if(ascii <= 122 && ascii >=97) {
				sb.setCharAt(i, (char)(ascii-32));
			}
		}
		System.out.println(sb);
			
	}

}
