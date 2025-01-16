package recursion;

public class SkipAcharacter {
	
	public static void print(String s, int i, String ans) {
		if(i == s.length()) {
			System.out.println(ans);
			return;
		}
		if(s.charAt(i) != 'a') ans += s.charAt(i);
		print(s, i + 1, ans);
	}

	public static void main(String[] args) {
		String s = "Satyam Mishra";
		
		print(s, 0, "");
		
//		TC = O(n)
	}

}
