package binarySearch;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 96;
//		System.out.println((int)Math.sqrt(x)); //It is the fastest method to calculate square, NEWTON RAPHSON method
//		//we typecasted bcoz we wanted integer
		
//		Method - 2
		
		int low = 0, high = x;
		int sqrt = 0;
		boolean flag = false;
		
		if(x <= 1) {
			System.out.println(x);
		}
		else {
			while(low <= high) {
				int mid = low + (high - low) / 2;
				if(mid > x / mid) { //mid * mid might have overflown, that's why written in other form
					high = mid - 1;
				}else if(mid < x / mid) { //Could also have used long instead of this modification
					low = mid + 1;
				}else {
					sqrt = mid;
					flag = true;
					break;
				}
			}

		}
		if(flag) System.out.println(sqrt);
		else System.out.println(high);
	}   
	
}
