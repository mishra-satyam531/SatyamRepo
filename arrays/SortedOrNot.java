package arrays;

public class SortedOrNot {

	public static void main(String[] args) {
		int[] arr = {4, 7, 18, 9, 22, 14, 16};
//		Mathod-1 : Brute Force
//		boolean flag = true;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					flag = false;
//					break;
//				}
//			}
//		}
//		if(flag) {
//			System.out.println("Array is sorted");
//		}else {
//			System.out.println("Array is not sorted");
//		}
		
//		Method-2 : Optimised
		int max = Integer.MIN_VALUE;
		boolean flag = true;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
	}

}
