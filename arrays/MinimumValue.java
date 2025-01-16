package arrays;

public class MinimumValue {

	public static void main(String[] args) {
	    int[] arr = {48, 45, 68, 56, 41, 65};
	    int min = Integer.MAX_VALUE;
	    for(int i=0; i<arr.length; i++) {
	    	min = Math.min(min, arr[i]);
	    }
	    System.out.print("Minimum value in array is: "+ min);
	}

}
