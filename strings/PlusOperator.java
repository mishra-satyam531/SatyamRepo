package strings;

public class PlusOperator {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		b = a + b + 10 ;
		b += "10";
		System.out.println(b);
		
//		ZABARDAST
		System.out.println(a + 10 + 20); //abc1020
		System.out.println(10 + 20 + a); //30abc
//		BUT IN BOTH CASES FINAL ANSWER WILL BE STRING	
	}

}
