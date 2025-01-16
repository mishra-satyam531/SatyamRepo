package arrays;

import java.util.Arrays;

public class DeepCopy {

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 1, 6, 4};
		int[] brr = Arrays.copyOf(arr, arr.length - 1);
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for(int ele : brr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		brr[0] = 10;
		System.out.println(arr[0]);
		System.out.println(brr[0]);	
//		int[] crr = new int[arr.length];
//		for(int i=0; i<crr.length; i++) {
//			crr[i] = arr[i];
//		}
//		for(int ele : crr) {
//			System.out.print(ele + " ");
//		}
//		System.out.println();
//		crr[0] = 10;
//		System.out.println(crr[0]);
//		System.out.println(arr[0]);
   }

}
