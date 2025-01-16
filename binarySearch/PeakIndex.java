package binarySearch;

import java.util.Arrays;

public class PeakIndex {
	
//Peak Index In a Mountain Array in O(logn) complexity
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 20, 10};
		int n = arr.length;
	    int low = 1, high = n - 2;
	    int pidx = 0;
	    
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
				low = mid + 1;
			}else if(arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
				high = mid - 1;
			}else {
				pidx = mid;
				break;
			}
		}
		System.out.println("Peak index is " + pidx);
	}

}
