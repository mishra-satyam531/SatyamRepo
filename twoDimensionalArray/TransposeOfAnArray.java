package twoDimensionalArray;

public class TransposeOfAnArray {

	public static void main(String[] args) {
		int[][] arr = {{5, 4, 8}, {7, 7, 6}, {9, 1, 6}, {1, 0, 3}};
		int m = arr.length, n = arr[0].length;
		
//		for(int j=0; j<n; j++) { //cols
//			for (int i = 0; i < m; i++) { //rows
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		Method-2 : Storing in new Array
		
		int[][] transpose = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				transpose[i][j] = arr[j][i];
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}	

}
