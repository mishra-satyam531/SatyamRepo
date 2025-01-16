package recursion;

public class BinaryStringsWithoutConsecutive1s {
	
	public static void BinaryStrings(int i, int n, String ans) {
		if(i > 1 && ans.charAt(i - 1) == '1' && ans.charAt(i - 2) == '1') return;
		if(i == n) {
			System.out.println(ans);
			return;
		}
		BinaryStrings(i + 1, n, ans + 0);
		BinaryStrings(i + 1, n, ans + 1);
	}

	public static void main(String[] args) {
		int n = 3;
		BinaryStrings(0, n, "");
	}

}
