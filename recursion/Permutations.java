package recursion;

public class Permutations {
	
	public static void print(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = 0; i < s.length(); i++) {
			String left = s.substring(0, i);
			String right = s.substring(i + 1);
			print(left + right, ans + s.charAt(i));
		}
	}

	public static void main(String[] args) {
		String s = "abcd";
		print(s, "");
		
//		TC = n(n-1)(n-2)...... = n!
//		TC = O(n!)
	}

}
