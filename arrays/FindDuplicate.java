package arrays;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = {42, 15, 48, 44, 48, 54, 48, 50, 15};
//		for(int i=0; i<arr.length; i++) {
//			boolean flag = false;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					if(!flag) {
//						System.out.println(arr[i]);
//						flag = true;
//					}
//				}
//			}
//		}
//		Method 2 : Optimized
		Arrays.sort(arr);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				System.out.println(arr[i]);
			}
		}
	}
}
