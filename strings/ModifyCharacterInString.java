package strings;

public class ModifyCharacterInString {

	public static void main(String[] args) {
		String s = "hello";
		s = s.substring(0,1) + "iam" + s.substring(2, 5); //both string and characters can be added
		System.out.println(s);
	}

}
