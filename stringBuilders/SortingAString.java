package stringBuilders;

import java.util.Arrays;

public class SortingAString {

	public static void main(String[] args) {
		
//		SORTING STRING
		String s = "satyam";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		
		for(char ele : ch) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
//		SORTING STRING BUILDER
		StringBuilder sb = new StringBuilder("mishra");
		char[] arr = sb.toString().toCharArray();
		Arrays.sort(arr);
		
		for(char x : arr) {
			System.out.print(x + " ");
		}
	}

}
