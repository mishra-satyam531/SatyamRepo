package recursion;

public class ArrayReverse {

	public static void reverse(int i, int[] arr) {
		if(i == arr.length) return;
		reverse(i + 1, arr);
		System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 5, 8, 2, 0, 7};
		reverse(0, arr);
	}

}
