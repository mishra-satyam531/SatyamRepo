package binarySearch;

import java.util.Arrays;

// LeetCode 2187
public class MinTimeToCompleteTrips {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int totalTrips = 5; 
		
		int n = arr.length;
		Arrays.sort(arr);
		
		long low = 1, high = (long) arr[n-1] * totalTrips;
		long ans = 0;
		while(low <= high) {
			long count = 0;
			long mid = low + (high - low) / 2;
			for (int i = 0; i < n; i++) {
				count += mid / arr[i];
			}
			if(count >= totalTrips) {
				ans = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.println(ans);
	}

}
