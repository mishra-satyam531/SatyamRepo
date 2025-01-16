package sorting;

import java.util.Arrays;

public class MinimumSumOfTwoNumbers {

	public static void main(String[] args) {
		int[] arr = {6, 8, 4, 5, 2, 3};
		Arrays.sort(arr);
		
		int num1 = 0, num2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				num1 = 10 * num1 + arr[i];
			}else {
				num2 = 10 * num2 + arr[i];
			}
		}
		
		System.out.println("Minimum possible sum of two numbers formed from digits of the array is: " + (num1 + num2));
	}

}
