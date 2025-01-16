package strings;

public class Substrings {

	public static void main(String[] args) {
		String s = "abcde";
		
		System.out.println(s.substring(2)); //from index 2 to end
		System.out.println(s.substring(1, 4)); //from index 1 to 3
		System.out.println(s.substring(2, 2)); //no output
//		System.out.println(s.substring(2, 1)); //error
//		System.out.println(s.substring(0, 6)); error
		System.out.println(s.substring(0, 5));
	}

}
