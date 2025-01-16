package arrays;

public class PassingArrayToMethods {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
//		Arrays are pass by reference
	}
	public static void change(int[] x) {
		x[0] = 15;
	}

}
