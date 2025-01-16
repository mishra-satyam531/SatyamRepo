package strings;

public class Equals {

	public static void main(String[] args) {
		String s = "abcxyz";
		String a = "abcxyz";
		String b = new String(s);
		String c = "abc";
		c += "xyz";
		
//		== compare addresses of the string and here s and a points to the same string and 
//		hence they are equal but b and c are new strings 
		
		System.out.println(s==a); //TRUE
		System.out.println(s==b); //FALSE
		System.out.println(s==c); //FALSE
		
		System.out.println(s.equals(a)); //TRUE
		System.out.println(s.equals(b)); //TRUE
		System.out.println(s.equals(c)); //TRUE
	}

}
