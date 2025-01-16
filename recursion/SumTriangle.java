package recursion;

import java.util.Arrays;

public class SumTriangle {
	
	public static void triangle(int[] arr) {
		if(arr.length < 1) return; 
		System.out.println(Arrays.toString(arr));
		
		int [] nextArr = new int[arr.length - 1];
		for (int i = 0; i < nextArr.length; i++) {
			nextArr[i] = arr[i] + arr[i + 1];
		}
		
		triangle(nextArr);
	}

	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
	  
		triangle(arr);
	}

}
