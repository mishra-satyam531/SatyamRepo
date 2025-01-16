package twoDimensionalArray;

import java.util.Scanner;

public class StoreRollNumAndMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[4][2];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
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
