package arrays;

public class StrictlyGreaterThanX {

	public static void main(String[] args) {
		int[] arr = {14, 25, 55, 45, 79, 93, 57, 9};
		int target = 30;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>target) {
				count++;
			}
		}
		System.out.print("Number of elements greater than " + target + " is " + count);
	}

}
