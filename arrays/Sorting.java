package arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = {10, 2, 5, 9, 3, 5};
		Arrays.sort(arr);
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
