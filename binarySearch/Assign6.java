package binarySearch;

public class Assign6 {
	
	public static int completeRows(int n) {
		int low = 0, high = n;
		while(low <= high) {
			int mid = low + (high - low) / 2;
//			coins used = 1 + 2 + 3 + ... + k = k*(k+1) / 2
			int coinsUsed = mid * (mid + 1) / 2; 
			if(coinsUsed == n) return mid; 
			else if(coinsUsed < n) low = mid + 1;
			else high = mid - 1;
		}
		return high;
	}

	public static void main(String[] args) {
		int n = 5;
		
		int ans = completeRows(n);
		System.out.println("Number of rows that can be formed is " + ans);
	}

}
