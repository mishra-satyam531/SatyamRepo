package twoDimensionalArray;

public class MatrixInWaveForm {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int m = arr.length, n = arr[0].length;
		
		for (int i = 0; i < m; i++) {
			if(i%2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}else {
				for (int j = n-1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
			
	}

}
