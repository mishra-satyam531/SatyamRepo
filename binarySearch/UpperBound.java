package binarySearch;

public class UpperBound {

//	arr[idx] > x
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 30, 40, 50, 60, 70};
		int n = arr.length;
		int low = 0, high = n -1;
		int tar = 30;
		int ub = n;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] > tar) {
				ub = mid;
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		
		System.out.println(ub);
	}

}
