package stringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s = scan.nextLine();
		System.out.print("Enter second string: ");
		String t = scan.nextLine();
		
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean flag = true;
		
		if(s.length() != t.length()) {
			flag = false;
		}else {
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.print("One string is an anagram of other");
		}else {
			System.out.println("One string is not an anagram of other");
		}
	}

}
