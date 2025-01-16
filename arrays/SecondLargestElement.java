package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {2,4,9,8,1,25,64,75,84,29,47};
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i=0; i<=n-1; i++) {
			max = Math.max(max, arr[i]);
		}
		for(int i=0; i<=n-1; i++) {
			if(max != arr[i]) {
				smax = Math.max(smax, arr[i]);
			}
		}
		System.out.println(max);
		System.out.println(smax);

	}

}
