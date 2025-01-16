package twoDimensionalArray;

public class PrintDiagonalElemenetsQ8 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int m = arr.length;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if(i == j || i + j == m-1) {
					System.out.print(arr[i][j] + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
