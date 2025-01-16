package twoDimensionalArray;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int[][] a = {{5, 4, 8}, {7, 7, 6}, {9, 1, -6}, {1, 5, 3}};
		int[][] b = {{5, 6, 7}, {1, 0, 1}, {2, 5, 4}, {6, 9, 7}};
		int m = a.length, n = b[0].length;
//		int[][] res = new int[m][n];
//		
//		for(int i=0; i<m; i++) {
//			for(int j=0; j<n; j++) {
//				res[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		for(int[] ele : res) {
//			for(int x : ele) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int[] ele : a) {
			for(int x : ele) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
