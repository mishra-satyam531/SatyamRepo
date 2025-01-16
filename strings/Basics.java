package strings;

public class Basics {

	public static void main(String[] args) {
		
//		STRINGS ARE IMMUTABLE
		
		String x = "Satyam Mishra";
		System.out.println(x);
		
		String s = "Hello ";
		String t = "World";
		
		String result = s.concat(t);
		System.out.println(result);
		
		String a = "Java ";
		String b = "is ";
		String c = "fun";
		
		String ans = a.concat(b).concat(c);
		System.out.println(ans);
	}

}
