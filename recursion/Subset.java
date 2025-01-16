package recursion;

import java.util.ArrayList;

public class Subset {
	
	//leetcode 78 for arrays, LeetCode 90 for duplicate numbers	
	static ArrayList<String> arr; //global variable
	public static void print(int i, String s, String ans) {
		if(i == s.length()) {
			arr.add(ans);
			return;
		}
		print(i + 1, s, ans); //not take
		print(i + 1, s, ans + s.charAt(i)); //take
	}

	public static void main(String[] args) {
		String s = "abc";
		arr = new ArrayList<>();
		
		print(0, s, "");
		System.out.println(arr);
		
//		TC = O(2^n)
	}

}
