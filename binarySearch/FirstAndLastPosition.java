package binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] arr = {10, 10, 20, 20, 20, 20, 20, 40, 40, 70};
		int n = arr.length;
		int tar = 10;
		int low = 0, high = n - 1;
		
//		METHOD - 1
//		boolean flag = false;
//		int[] ans = {-1, -1};
//		
////	Check if element is even present or not
//		while(low <= high) {
//			int mid = low + (high - low) / 2;
//			if(arr[mid] > tar) {
//				high = mid - 1;
//			}else if(arr[mid] < tar) {
//				low = mid + 1;
//			}else {
//				flag = true;
//				break;
//			}
//		}
//		
//		if(!flag) {
//			System.out.println(Arrays.toString(ans));
//		}else {
////		FIRST OCCURENCE
//			low = 0; high = n - 1;
//			int lb = n;
//			while(low <= high) {
//				int mid = low + (high - low) / 2;
//				if(arr[mid] >= tar) {
//					lb = mid;
//					high = mid - 1;
//				}else {
//					low = mid + 1;
//				}				
//			}
//			ans[0] = lb;
//			
////		LAST OCCURENCE
//			low = 0; high = n - 1;
//			int ub = n;
//			while(low <= high) {
//				int mid = low + (high - low) / 2;
//				if(arr[mid] > tar) {
//					ub = mid;
//					high = mid - 1;
//				}else {
//					low = mid + 1;
//				}			
//			}
//			ans[1] = ub - 1; // subtracted 1 to get last occurence and not upper bound
//			
//			System.out.println(Arrays.toString(ans));
//		}
		
//		METHOD - 2
		
		int[] ans = new int[2];
		
		int fp = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == tar) {
				if(mid > 0 && arr[mid] == arr[mid - 1]) {
					high = mid - 1;
				}
				else {
					fp = mid;
					break;
				}
			}else if(arr[mid] > tar) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		ans[0] = fp;
		
		low = 0; high = n-1;
		int lp = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == tar) {
				if(mid + 1 < n && arr[mid] == arr[mid + 1]) {
					low = mid + 1;
				}else {
					lp = mid;
					break;
				}
			}else if(arr[mid] > tar) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		ans[1] = lp;
		
		System.out.println(Arrays.toString(ans));
	}
}
