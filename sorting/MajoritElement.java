package sorting;

import java.util.Arrays;

public class MajoritElement {

//	Majority element means which occur more than n/2 times
	public static void main(String[] args) {
		int[] arr = {2, 2, 1, 1, 1, 2, 2};
		int n = arr.length;
		
		Arrays.sort(arr);
		System.out.println("Majority element in the given array is: " + arr[n/2]);
	}

}
