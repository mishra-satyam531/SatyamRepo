package stringBuilders;

public class CompressTheString {

	public static void main(String[] args) {
		String s = "aaaabbcddeaaffdg";
		StringBuilder ans = new StringBuilder();
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(j) != s.charAt(i)) {
				ans.append(s.charAt(i));
				if((j-i) > 1) ans.append(j-i);
				i=j;
			}
		}
		
		ans.append(s.charAt(i));
		if(s.length()-i > 1) ans.append(s.length()-i);
		
		System.out.println(ans);
	}

}
