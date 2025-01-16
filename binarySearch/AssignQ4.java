package binarySearch;

public class AssignQ4 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 5};
		int n = arr.length;
		
		int low = 0, high = n - 1, repeated = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] != mid+1) {
				repeated = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.println("Repeated element is " + repeated);
	}

}
