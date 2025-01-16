package recursion;

// Print all increasing sequences of length k from first n natural numbers

import java.util.ArrayList;

public class IncreasingSequence {
	
	static ArrayList<String> arr;
	
	public static void print(int i, String s, String ans, int k) {
		if(ans.length() == k) {
			arr.add(ans);
			return;
		}
		if(i == s.length()) return;
		print(i + 1, s, ans, k); // not take
		print(i + 1, s, ans + s.charAt(i), k); // take
	}
	public static void main(String[] args) {
		String s = "123456";
		int k = 4;
		
		arr = new ArrayList<>();
		
		print(0, s, "", k);
		System.out.println(arr);
		
	}

}
