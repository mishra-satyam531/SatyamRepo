package binarySearch;

public class Assign5 {
	
	public static boolean isPerfectSquare(int n) {
		if(n == 1 || n == 0) return true;
		
		int low = 1, high = n / 2 + 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			long square = (long) mid * mid;
			if(square == n) return true;
			else if(square < n) low = mid + 1;
			else high = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 36;
		
		if(isPerfectSquare(n)) System.out.println(n + " is a perfect square");
		else System.out.println(n + " is not a perfect square");
	}

}
