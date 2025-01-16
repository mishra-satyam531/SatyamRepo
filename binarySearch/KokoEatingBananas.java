package binarySearch;

import java.util.Arrays;

//LeetCode 875
public class KokoEatingBananas {
	
	public static boolean isPossible(int[] arr, int mid, int h, int n) {
		int k = 0;
		for (int i = 0; i < n; i++) {
			if((arr[i] % mid) == 0) k += arr[i] / mid;
			else k += arr[i] / mid + 1;
			if(k > h) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {312884470};
		int h = 312884469;
		
		Arrays.sort(arr);
		int n = arr.length;
		int low = 1, high = arr[n - 1], ans = 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(isPossible(arr, mid, h, n)) {
				ans = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.println(ans);
	}

}
