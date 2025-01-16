package binarySearch;

public class Assign7 {

	public static void main(String[] args) {
		int[] arr = {10, 8, 7, 5, 4, 2, 1};
		int tar = 10;
		
		boolean found = false;
		int n = arr.length;
		int low = 0, high = n-1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] < tar) high = mid - 1;
			else if(arr[mid] > tar) low = mid + 1;
			else {
				found = true;
				break;
			}
		}
		if(found) System.out.println("Target is present");
		else System.out.println("Target is not present");
	}

}
