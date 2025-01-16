package stringBuilders;

public class StringBuilderFunctions {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Satyam");
		StringBuilder tb = new StringBuilder("Mishra");
		
		System.out.println(sb.compareTo(tb));
		System.out.println(sb.reverse());
	}

}
