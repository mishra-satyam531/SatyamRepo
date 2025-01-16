package sorting;

import java.util.Arrays;

public class KthSmallestElement {
// k <= size of array
	public static void main(String[] args) {
		int[] arr = {8, 1, 5, 4, 9};
		int k = 4;
		
		Arrays.sort(arr);
		
		System.out.println(k + "th smallest element is: " + arr[k - 1]);
	}

}
