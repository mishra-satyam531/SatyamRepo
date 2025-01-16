package twoDimensionalArray;

public class SumOfRectangleQ3 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, -3, 4}, {0, 0, -4, 2}, {1, -1, 2, 3}, {-4, -5, -7, 0}};
		int l1 = 1, r1 = 2, l2 = 3, r2 = 3;
		int rowStart = Math.min(l1, l2);
		int rowEnd = Math.max(l1, l2);
		int colStart = Math.min(r1, r2);
		int colEnd = Math.max(r1, r2);
		int sum = 0;
		
		for (int i = rowStart; i <= rowEnd; i++) {
			for (int j = colStart; j <= colEnd; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	
	}

}
