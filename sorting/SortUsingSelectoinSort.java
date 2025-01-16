package sorting;

public class SortUsingSelectoinSort {
	
//	Sort using selection sort, but in each pass put the kth maximum element at the right position 

	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 5, 4};
		print(arr);
		int n = arr.length;
		
		for (int i = n-1; i > 0; i--) {
			int max = Integer.MIN_VALUE;
			int maxdx = 0;
			for (int j = i; j >= 0; j--) {
				if(max < arr[j]) {
					max = arr[j];
					maxdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxdx];
			arr[maxdx] = temp;
		}
		print(arr);
	}

}
