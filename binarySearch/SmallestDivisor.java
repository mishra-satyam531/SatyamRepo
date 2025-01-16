package binarySearch;

public class SmallestDivisor {

	// LeetCode 1283
	public static void main(String[] args) {
//		int[] arr = {5, 1, 9, 2};
//		int n = arr.length;
//		int th = 6; //threshold
//		int d = 1;
//		
//		Methdod - 1
//		int max = Integer.MIN_VALUE;
//		for(int i = 0; i < n; i++) {
//			max = Math.max(max, arr[i]);
//		}
//		
//		for(; d <= max; d++) {
//			int sum = 0;
//			for (int i = 0; i < n; i++) {
//				if(arr[i] % d == 0) {
//					sum += arr[i] / d;
//				}else {
//					sum += (arr[i] / d) + 1;
//				}
//			}
//			if(sum <= th) {
//				System.out.println(d);
//				break;
//			}
//		}
//		//Time complexity O(n * max)
		
		//Method - 2
		int[] arr = {44, 22, 33, 11, 1};
		int n = arr.length;
		
		int t = 7;
		int ans = 0;
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, arr[i]);
		}
		int low = 1, high = max; 
		while(low <= high) {
			int sum = 0;
			int mid = low + (high - low) / 2;
			for (int i = 0; i < n; i++) {
				if(arr[i] % mid == 0) {
					sum += arr[i] / mid;
				}else {
					sum += (arr[i] / mid) + 1;
				}
			}
			if(sum <= t) {
				ans = mid;
				high = mid - 1;
			}
			else if(sum > t) {
				low = mid + 1;
			}
		}
		
		System.out.println(ans);
//		TC = O(n*logmx)
	}
}
