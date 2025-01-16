package bitManipulation;

public class TurnOnKthBit {

	public static void main(String[] args) {
		int a = 500, k = 3;
		int mask = 1 << k;
		int ans = a | mask;
		System.out.println(ans);
	}

}
