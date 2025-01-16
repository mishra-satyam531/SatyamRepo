package strings;

public class LowerCaseAndConcat {

	public static void main(String[] args) {
		String s = "I am Satyam Mishra";
		s = s.toLowerCase(); //Can store in another string as well
		System.out.println(s); //Can directly print too
		
		System.out.println(s.toUpperCase());
		
		String a = "abc";
		String b = "xyz";
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(b.concat(b));
		System.out.println(a.concat("hello"));
	}

}
