package arrays;

public class FindMaxElement {

	public static void main(String[] args) {
		int[] arr = {4,8,6,2,5,3};
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<=5; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value in array is " + max);
	}

}
