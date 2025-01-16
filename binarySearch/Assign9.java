package binarySearch;

public class Assign9 {

	public static void main(String[] args) {
		int[][] arr = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
		int tar = 16;
		
		int n = arr.length, m = arr[0].length;
		boolean found = false;
		
		int low = 0, high = m * n - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int row = mid / m, col = mid % m;
			int midElement = arr[row][col];
			if(midElement == tar) {
				found = true;
				break;
			}else if(midElement < tar) low = mid + 1;
			else high = mid - 1;
		}
		
		if(found) System.out.println("Target found");
		else System.out.println("Target not found");
	}

}
