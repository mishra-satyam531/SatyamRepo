package stringBuilders;

import java.util.Scanner;

public class ConvrtToInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string of length less than 10: ");
		String s = scan.nextLine();
		int ans = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ans = ans*10 + ch - '0'; //(here ch-'0' i.e. character - character will subtract ascii values
		}
		
		System.out.println(ans);
		
	}

}
