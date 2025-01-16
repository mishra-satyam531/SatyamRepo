package bitManipulation;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 6, b = 7;
		System.out.println(a + " " + b);
//		XOR OPERAOTR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
	}

}
