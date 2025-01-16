package stringBuilders;

public class StringWithMaximumValue {

	public static void main(String[] args) {
		String[] arr = {"14567", "35754","035754", "0014547"};
//		int max = Integer.parseInt(arr[0]);
//		for (int i = 0; i < arr.length; i++) {
//			int n = Integer.parseInt(arr[i]);
//			max = Math.max(max, n);
//		}
//		System.out.println((max));
		
		//Above method only works for strings in range of integer
		
		//BETTER METHOD 
		
		String maxS = arr[0];
		for (int i = 1	; i < arr.length; i++) { // started from one as maxS is already arr[0]
			maxS = max(maxS, arr[i]);
		}
		System.out.println(maxS);
	}
	
	public static String max(String a, String b) {
		String s = purify(a), t = purify(b);
		if(s.length() > t.length()) return a;
		if(t.length() > s.length()) return b;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i)) {
				if(s.charAt(i) > t.charAt(i)) return a;
				else return b;
			}
		}
		if(a.length() >= b.length()) return a;
		return b;
		
	}
	public static String purify(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != '0') {
				return s.substring(i);
			}
		}
		return "0";
	}

}
