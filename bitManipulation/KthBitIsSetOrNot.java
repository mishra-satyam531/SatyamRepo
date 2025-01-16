package bitManipulation;

public class KthBitIsSetOrNot {

	public static void main(String[] args) {
//		METHOD 1
		int n = 505, k = 3;
		int mask = 1 << k;
		if((n & mask) != 0) System.out.println("ON");
		else System.out.println("OFF");
//		METHOD - 2
//		RIGHT SHIFT
		n >>= k;
		if(n % 2 == 1) System.out.println("ON");
		else System.out.println("OFF");
	}

}
