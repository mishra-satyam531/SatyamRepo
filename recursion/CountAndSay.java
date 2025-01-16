package recursion;

import java.util.Scanner;

// LeetCode 38

public class CountAndSay {
	
	public static String cas(int n) {
		if(n == 1) return "1";
		String s = cas(n - 1);
		
		StringBuilder ans = new StringBuilder();
		int i = 0, j = 0;
		while(j < s.length()) {
			if(s.charAt(i) == s.charAt(j)) j++;
			else {
				int len = j - i;
				ans.append(len);
				ans.append(s.charAt(i));
				i = j; j++;
			}
		}
		int len = j - i;
		ans.append(len);
		ans.append(s.charAt(i));
		
		return ans.toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		
		System.out.println(cas(n));
	}

}
