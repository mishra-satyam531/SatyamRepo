package sorting;

import java.util.Arrays;

public class AlmostSortedArray {
	
	// Helper method to find the index of the element in the sorted array
	public static int findIndex(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;// This case shouldn't happen as all elements exist

	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 1, 5};
		int n = arr.length;
		
		int[] sortedArr = Arrays.copyOf(arr, n);
		Arrays.sort(sortedArr);
		
		boolean flag = true;
				
		 // Check if the original array is "almost sorted"
		for (int i = 0; i < n; i++) {
			if(arr[i] != sortedArr[i]) {
				int indexInSorted = findIndex(sortedArr, arr[i]);
				 // If element in the original array is not at the correct position in the sorted array
				if(Math.abs(i - indexInSorted) > 1) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) System.out.println("Array is almost sorted");
		else System.out.println("Array is not almost sorted");
	}

}
