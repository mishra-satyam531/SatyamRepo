package twoDimensionalArray;

public class MaximumSumRow {

	public static void main(String[] args) {
		int[][] arr = {{1, 3, 5, 7}, {3, 4, 7, 8}, {1, 4, 12, 3}};
		int m = arr.length, n = arr[0].length;
		int maxSum = Integer.MIN_VALUE;
		int row = 0;
		
		for (int i = 0; i < m; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			if(sum > maxSum) {
				maxSum = sum;
				row = i;
			}
		}
		
		System.out.println("Row with maximum sum is : " + row);
	}

}
