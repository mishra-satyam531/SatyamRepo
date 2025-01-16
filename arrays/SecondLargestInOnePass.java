package arrays;

public class SecondLargestInOnePass {

	public static void main(String[] args) {
		int [] arr = {48, 45, 68, 56, 41, 65};
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i]>secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second Largest element is: " + secondLargest);
	}

}
