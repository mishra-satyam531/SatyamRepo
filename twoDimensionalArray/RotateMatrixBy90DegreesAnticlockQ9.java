package twoDimensionalArray;

public class RotateMatrixBy90DegreesAnticlockQ9 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int m = arr.length, n = arr[0].length;
		int[][] trans = new int[n][m];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				trans[j][i] = arr[i][j];
			}
		}
		
		int a = 0, b = m-1;
		while(a < b) {
			for (int j = 0; j < trans[0].length; j++) {
				int temp = trans[a][j];
				trans[a][j] = trans[b][j];
				trans[b][j] = temp;
			}
			a++; b--;
		}
		
		for(int[] ele : trans) {
			for(int x : ele) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
