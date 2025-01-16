package bitManipulation;

public class TurnOffKthBit {

	public static void main(String[] args) {
//		TurnOffKthBit / Clear Kth Bit
		int n = 485, k = 2;
		int mask = 1 << k;
		mask = ~mask;
		System.out.println(n & mask);
	}

}
