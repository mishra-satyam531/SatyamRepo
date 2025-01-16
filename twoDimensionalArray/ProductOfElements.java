package twoDimensionalArray;

public class ProductOfElements {

	public static void main(String[] args) {
		int[][] arr = {{5, 4, 8}, {7, 7, 6}, {9, 1, -6}, {1, 5, 3}};
		int product = 1;
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				product *= arr[i][j];
			}
		}
		System.out.println("Product of elements in array is : " + product);
	}

}
