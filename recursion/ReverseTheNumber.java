package recursion;

public class ReverseTheNumber {
	
	public static void reverse(int i, String s, StringBuilder ans) {
		if(i < 0) {
			int j = 0, count = 0;
			while(j < ans.length()) {
				if(ans.charAt(j) == '0'){
					count++; j++;
				}else {
					break;
				}
			}
			ans.append(ans.substring(count));
			System.out.println(ans);
			return;
		}
		ans.append(s.charAt(i));
		reverse(i - 1, s, ans);
	}

	public static void main(String[] args) {
		String s = "548692000";
		
		reverse(s.length() - 1, s, new StringBuilder());
	}

}
