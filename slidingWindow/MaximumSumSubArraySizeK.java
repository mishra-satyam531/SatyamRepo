package slidingWindow;

public class MaximumSumSubArraySizeK {

	public static void main(String[] args) {
		int[] arr = {10,20,1,3,-40,80,10};
		int k = 3;
		int n = arr.length;
		
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		
		int i = 1, j = k, maxSum = sum;
		while(j < n) {
			sum = sum - arr[i-1] + arr[j];
			maxSum = Math.max(maxSum, sum);
			i++; j++;
		}
		
		System.out.println(maxSum);
	}
}