package binarySearch;

public class CapacityToShipPackages {
	
//	LeetCode 1011
	public static boolean isPossible(int[] arr, int d, int mid) {
		int n = arr.length;
		int load = 0;
		for (int i = 0; i < n && d >= 1; i++) {
			if(arr[i] + load <= mid) {
				load += arr[i];
			}else {
				d--;
				load = arr[i];
			}
			if(d < 1) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;
		int days = 5;
		
		int sum = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr[i]);
			sum += arr[i];
		}
		
		int low = max, high = sum, minCap = sum;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(isPossible(arr, days, mid)) {
				minCap = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.println("Minimum capacity is " + minCap);
	}

}
