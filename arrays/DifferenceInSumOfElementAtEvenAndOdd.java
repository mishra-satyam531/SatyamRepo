package arrays;

public class DifferenceInSumOfElementAtEvenAndOdd {

	public static void main(String[] args) {
		int[] arr = {5, 7, 8, 8, 9, 1, 2, 3, 4, 9, 8};
		int evenSum = 0, oddSum = 0;
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				evenSum += arr[i];
			}else {
				oddSum += arr[i];
			}
		}
		
		System.out.println("Difference between sum of elements at odd and even : " + (evenSum-oddSum));
	}

}
