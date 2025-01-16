package strings;

public class NumberOfDigitsWhithoutLoop {

	public static void main(String[] args) {
		int n = 1234;
		Long num = 577945112206L; //Can also use small L just like in float
//		String s = n + "";
		
		String s = Integer.toString(n);
		String s1 = Long.toString(num);
		System.out.println(s.length());
		System.out.println(s1.length());
	}

}
