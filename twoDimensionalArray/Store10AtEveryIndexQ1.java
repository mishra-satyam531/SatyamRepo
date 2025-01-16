package twoDimensionalArray;

import java.util.Iterator;

public class Store10AtEveryIndexQ1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 5;
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
