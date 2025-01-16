package stringBuilders;

public class Basics {

	public static void main(String[] args) {
		
		//STRING BUILDERS ARE MUTABLE
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
		
		StringBuilder a = new StringBuilder("Satyam");
		System.out.println(a);
		
		//Creating Empty String
		StringBuilder b = new StringBuilder(); //by default capacity is 16
		System.out.println(b.length());
		
		System.out.println(sb.capacity()); //16+5
		System.out.println(a.capacity());  //16+6
		System.out.println(b.capacity());  //16
		
		StringBuilder c = new StringBuilder(10); //10 is capacity
		
		System.out.println(c.capacity());
		
	}

}
