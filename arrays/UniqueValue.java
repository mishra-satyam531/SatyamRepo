package arrays;

import java.util.Arrays;

public class UniqueValue {

	public static void main(String[] args) {
		int[] arr = {2, 7, 8, 8, 7, 6, 1, 6, 1, 2, 9};
		Arrays.sort(arr);
		int i=0;
		
		for(; i<arr.length-1; i+=2) {
			if(arr[i] != arr[i+1]) {
				System.out.println("Unique element is : " + arr[i]);
				break;
			}
		}
		if(i==arr.length-1) {
			System.out.println("Unique element is : " + arr[i]);
		}
	}

}
