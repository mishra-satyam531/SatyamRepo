package twoDimensionalArray;

public class MultiplicationOfTwoMatrices {
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 1}, {2, 1, 2}};
		int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}};
		int[][] c = new int[a.length][b[0].length];
		
		if(a[0].length != b.length){
			System.out.println("Matrix multiplication is not possible");
		}else {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[0].length; j++) {
					for (int k = 0; k < b.length; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		
		print(c);
		
	}

}
