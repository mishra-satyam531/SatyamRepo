package twoDimensionalArray;

public class LargestElement {

	public static void main(String[] args) {
		int[][] arr = {{5, 4, 8}, {7, 7, 6}, {9, 1, 6}, {1, 0, 3}};
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				max = Math.max(max, arr[i][j]);
			}
		}
		System.out.println("Largest element in array is : " + max);
	}

}
