package stringBuilders;

public class DeleteAndInsert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.deleteCharAt(3); //Remove third index
		System.out.println(sb);
		
		sb.append("xyz");
		System.out.println(sb);
		
		sb.delete(2, 6);//delete elements from 2 to 5
		System.out.println(sb);
		
		sb.insert(2, 'x'); //can also insert string, integers, boolean....
		System.out.println(sb);
	}

}
