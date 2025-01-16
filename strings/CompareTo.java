package strings;

public class CompareTo {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		System.out.println((a.compareTo(b))); //Compare ASCII values in sequence
		
		String c = "aBc";
		String d = "abc";
		System.out.println(c.compareTo(d));
		
		String e = "abcgdc";
		String f = "abc";
		System.out.println(e.compareTo(f)); //if the number of elements are not same then it will return number of excess characters(return in negative if second variable is in excess
	}

}
