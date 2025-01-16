package strings;

public class ContainsAndStartsWith {

	public static void main(String[] args) {
		String s = "Hello! You are learning Java";
		System.out.println(s.contains("l"));
		System.out.println(s.contains(s)); //TRUE
		
		System.out.println(s.startsWith("h"));
		System.out.println(s.startsWith(s)); //TRUE
		
		System.out.println(s.endsWith("ava"));
		System.out.println(s.endsWith(s)); //TRUE
	}

}
