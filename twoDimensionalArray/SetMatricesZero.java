package twoDimensionalArray;

public class SetMatricesZero {

	public static void main(String[] args) {
		
//		Method-1 : By creating a copy of array
//		
		int[][] arr = {{8, 5, 0, 6}, {4, 3, 2, 1}, {1, 3, 1, 5}};
		int m = arr.length, n = arr[0].length;
//		int[][] helper = new int[m][n];
//		
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				helper[i][j] = arr[i][j];
//			}
//		}
//		
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if(helper[i][j] == 0) {
//					for (int j2 = 0; j2 < n; j2++) {
//						arr[i][j2] = 0;
//					}
//					for (int j2 = 0; j2 < m; j2++) {
//						arr[j2][j] = 0;
//					}
//				}
//			}
//		}
//		
//		for (int[] is : arr) {
//			for (int is2 :is) {
//				System.out.print(is2 + " ");
//			}
//			System.out.println();
//		}
		
//		Method-2 : Optimized(using less space)
		
//		boolean[] row = new boolean[m]; // default value is false
// 		boolean[] col = new boolean[n]; // default value is false
// 		
// 		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if(arr[i][j] == 0) {
//					row[i] = true;
//					col[j] = true;
//				}
//			}
//		}
// 		
 		//set the 'true' rows to zero
// 		for (int i = 0; i < m; i++) {
//			if(row[i] == true) {
//				for (int j = 0; j < n; j++) {
//					arr[i][j] = 0;
//				}
//			}
//		}
// 		
 		//set the 'true' col to zero
// 		for (int j = 0; j < n; j++) {
//			if(col[j] == true) {
//				for (int i = 0; i < m; i++) {
//					arr[i][j] = 0;
//				}
//			}
//		}
// 		
// 		for(int[] ele : arr) {
// 			for(int x : ele) {
// 				System.out.print(x);
// 			}
// 			System.out.println();
// 		}
		
		//Method-3 : More optimized
		boolean zerothRow = false;
		boolean zerothCol = false;
		
		for (int i = 0; i < m; i++) {
			if(arr[i][0] == 0) {
				zerothCol = true;
				break;
			}
		}
		for (int j = 0; j < n; j++) {
			if(arr[0][j] == 0) {
				zerothRow = true;
				break;
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][j] == 0) {
					arr[0][j] = 0;
					arr[i][0] = 0;
				}
			}
		}
		
		for (int i = 1; i < m; i++) {
			if(arr[i][0] == 0) {
				for (int j = 1; j < n; j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int j = 1; j < n; j++) {
			if(arr[0][j] == 0) {
				for (int i = 1; i < m; i++) {
					arr[i][j] = 0;
				}
			}
		}
		
		if(zerothRow) {
			for (int j = 0; j < n; j++) {
				arr[0][j] = 0;
			}
		}
		if(zerothCol) {
			for (int i = 0; i < m; i++) {
				arr[i][0] = 0;
			}
		}

		
		for(int[] ele : arr) {
 			for(int x : ele) {
 				System.out.print(x + " ");
 			}
 			System.out.println();
 		}
	}
}