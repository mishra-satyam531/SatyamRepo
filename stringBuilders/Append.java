package stringBuilders;

public class Append {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("xyz");
		System.out.println(sb);

		sb.append('o');
		System.out.println(sb);
		
		sb.append(15);
		System.out.println(sb);
		
		char[] arr = {'d', 'e', 'f'}; //only character array
		sb.append(arr);
		System.out.println(sb);
		
		StringBuilder t = new StringBuilder("pqr");
		sb.append(t);
		System.out.println(sb);
		
//		sb += "mno"; not defined for string builder
	}

}
