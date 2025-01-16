package binarySearch;

public class Assign8 {
	
	public static boolean searchIndex(int[] arr, int tar) {
		int index = 1;
		
		while(index < arr.length && arr[index] < tar) {
			index *= 2;
		}
		
		return binarySearch(index/2, Math.min(arr.length, index), arr, tar);
	}
	
	public static boolean binarySearch(int low, int high, int[] arr, int tar) {
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == tar) return true;
			else if(arr[mid] > tar) high = mid - 1;
			else low = mid + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		// Assume this is part of an infinite sorted array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
        
        int tar = 15;
        boolean ans = searchIndex(arr, tar);
        
        if(ans) System.out.println("Target found");
        else System.out.println("Target not found");
	}

}
