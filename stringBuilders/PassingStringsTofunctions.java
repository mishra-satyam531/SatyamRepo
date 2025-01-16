package stringBuilders;

public class PassingStringsTofunctions {

	public static void main(String[] args) {
		String s = "Satyam";
		System.out.println(s);
		change(s);
		System.out.println(s); //no change as string is pass by value
	}
	
	public static void change(String s) {
		s = "Mishra";
	}

}
