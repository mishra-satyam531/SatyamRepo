package stringBuilders;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "race";
		String t = "mood";
		char[] arr = new char[128]; //default value - '\0'
		boolean flag = true;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char dh = t.charAt(i);
			if(arr[(int)ch] == '\0') arr[(int)ch] = dh; //if '\0' is present store dh
			else {
				if(arr[(int)ch] != dh) flag = false; //if dh is not present return false
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = '\0';
		}
		
		for (int i = 0; i < t.length(); i++) {
			char ch = s.charAt(i);
			char dh = t.charAt(i);
			if(arr[(int)dh] == '\0') arr[(int)dh] = ch;
			else {
				if(arr[(int)dh] != ch) flag = false;
			}
		}
		if(flag) {
			System.out.println("Strings are isomorphic");
		}else {
			System.out.println("Strings are not isomorphic");
		}
	}

}
