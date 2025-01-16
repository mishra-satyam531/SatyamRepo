package binarySearch;

public class MinimisedMaximumOfProductsDistributed {
	
	//LeetCode 2064
	public static boolean isPossible(int[] arr, int mid, int tStores) {
		int n = arr.length;
		int stores = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] % mid == 0) stores += arr[i] / mid;
			else stores += arr[i] / mid + 1;
			if(stores > tStores) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {15, 10, 10};
		int tStores = 7;
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr[i]);
		}
		
		int ans = 1;
		int low = 1, high = max;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(isPossible(arr, mid, tStores)) { 
				ans = mid;
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		
		System.out.println(ans);
	}

}
