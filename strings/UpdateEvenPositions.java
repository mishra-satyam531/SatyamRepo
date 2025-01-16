package strings;

public class UpdateEvenPositions {

	public static void main(String[] args) {
		String s = "Physics Wallah Skills";
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			if(i%2 != 0) {
				str += s.charAt(i);
			}else {
				str += "a";
			}
		}
		
		System.out.println(str);
	}

}
