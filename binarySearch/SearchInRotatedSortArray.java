package binarySearch;

public class SearchInRotatedSortArray {

	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
		int n = arr.length;
		int low = 0, high = n - 1;
		int tar = 1;
		int ans = -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == tar) {
				ans = mid;
				break;
			}else if(arr[mid] <= arr[high]) { //i am in right sorted array (mid to high everything is sorted)
				if(arr[mid] < tar && tar <= arr[high]) {
					low = mid + 1;
				}else high = mid - 1;
			}else { //i am in the left sorted array (low to mid everything is sorted)
					if(arr[mid] > tar && tar >= arr[low]) {
						high = mid - 1;
					}else low = mid + 1;
			}
		}
		
		System.out.println("Index of the target element is " + ans);
	}

}
