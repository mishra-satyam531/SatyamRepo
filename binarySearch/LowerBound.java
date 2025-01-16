package binarySearch;

public class LowerBound {
	
//  arr[idx] >= x
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 30, 40, 50, 60, 70};
		int n = arr.length;
		int low = 0, high = n-1;
		int tar = 90;
		int lb = n; //lower bound		
		
		while(low <= high) {
			int mid = low + (high - low ) / 2;
			if(arr[mid] >= tar) {
				lb = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.println("Lower bound of " + " is " + lb);
	}

}
