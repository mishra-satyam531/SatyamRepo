package binarySearch;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int[] arr = {10, 15, 21, 34, 81, 105, 180, 500, 614};
		int n = arr.length;
		int tar = 81;
		int low = 0, high = n-1;
		
		boolean flag = false;
		while (low <= high) {
			int mid =  low + (high - low) / 2; // (low + high) / 2 range ke bahar bhi ja skta hai 
			if(arr[mid] > tar) high = mid - 1;
			else if(arr[mid] < tar) low = mid + 1;
			else {
				flag = true;
				break;
			}
		}
		
		if(flag) System.out.println("Target is present");
		else System.out.println("Target is not present");
	}

}
