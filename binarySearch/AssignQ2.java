package binarySearch;

public class AssignQ2 {

	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 1, 1};
		int n = arr.length;
		
		int low = 0, high = n - 1;
		boolean found = false;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == 0) low = mid + 1;
			else {
				if(mid == 0 || arr[mid - 1] == 0) {  // If mid is 0 or the element just before mid is 0, we've found the first 1
					found = true;
					System.out.println(n - mid);
					break;
				}
				else high = mid - 1;
			}
		}
		if(!found) System.out.println(0);
	}

}
