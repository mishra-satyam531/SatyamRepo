package binarySearch;

public class AssignQ3 {

	public static void main(String[] args) {
		int[][] arr = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
		int n = arr.length;
		int m = arr[0].length;
		
		int maxOne = 0, idx = -1;
		for (int i = 0; i < n; i++) {
			int totalOne = 0;
			int low = 0, high = m - 1;
			while(low <= high) {
				int mid = low + (high - low) / 2;
				if(arr[i][mid] == 0) low = mid + 1;
				else {
					if(mid == 0 || arr[i][mid-1] == 0) {
						totalOne = m - mid;
						break;
					}else high = mid - 1;
				}
			}
			if(totalOne > maxOne) {
				maxOne = totalOne;
				idx = i;
			}
		}
		
		System.out.println("Row with maximum number of 1 is " + idx);
	}

}
