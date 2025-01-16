package twoDimensionalArray;

public class DiplayMidRowMidColQ6 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {7, 6, 5, 4, 3}, {8, 7, 6, 5, 4}, {1, 2, 37, 8, 0}};
		int m = arr.length, n = arr[0].length;
		
		if(m != n || m %2 == 0) {
			System.out.print("Matrix should be an odd sqaure matrix");
		}else {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if(i == m/2 || j == m/2) {
						System.out.print(arr[i][j] + " ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}

}
