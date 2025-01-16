package bitManipulation;

public class TurnOffRightMostSetBit {

	public static void main(String[] args) {
//		Method - 1  TC - O(logn)
		int a = 450;
		int k = 0;
		int b = a;
		while(b % 2 == 0) {
			b >>= 1;
			k++;
		}
		int mask = 1 << k;
		mask = ~mask;
		System.out.println(a & mask);
//		METHOD - 2  TC - O(1)
		System.out.println(a & (a-1));
	}

}
