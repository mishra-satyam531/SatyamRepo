package binarySearch;

public class Assign1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 4, 4, 4, 5};
		int tar = 0;
		int n = arr.length;
		
		int ub = n, low = 0, high = n - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] > tar) {
				ub = mid;
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		
		if(ub > 0 && arr[ub - 1] == tar) System.out.println(ub - 1);
		else System.out.println(-1);
	}

}
