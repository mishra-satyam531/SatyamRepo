package binarySearch;

public class KthMissingPositiveNumber {

//	LeetCode 1539
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 7, 11};
		int k = 5;
		
		int n = arr.length;
		int low = 0, high = n - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int missed = arr[mid] - (mid + 1);
			if(missed < k) low = mid + 1;
			else high = mid - 1;
		}
		
		int ans = k + low; 
//		Loop tootne ke baad high = low - 1 ho jata h to 
//		arr[high] + k - (arr[high] - (hi + 1))
//		k + (hi + 1) = k + low
		
		System.out.println("Kth missing positive element is " + ans);
	}

}
