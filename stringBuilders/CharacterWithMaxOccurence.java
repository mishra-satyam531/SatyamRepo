package stringBuilders;

public class CharacterWithMaxOccurence {

	public static void main(String[] args) {
		String s = "helleel";
		int[] freq = new int[26];
//		0-a, 1-b, 2-c.....
		
		for (int i = 0; i < s.length(); i++) {
			 int ch = (int)s.charAt(i);
			 freq[ch-97]++;
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < freq.length; i++) {
			max = Math.max(max, freq[i]);// cannot find index in this loop kyuki fir wo first max element hi print krega
		}
		for (int i = 0; i < freq.length; i++) {
			if(freq[i] == max) {
				System.out.print((char)(i+97));
			}
		}
	}

}
