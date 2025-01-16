package twoDimensionalArray;

public class SumOfElements {

	public static void main(String[] args) {
		int[][] arr = {{5, 4, 8}, {7, 7, 6}, {9, 1, -6}, {1, 0, 3}};
		int sum = 0;
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of elements in array is : " + sum);
	}

}
