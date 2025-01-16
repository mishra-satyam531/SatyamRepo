package twoDimensionalArray;

import java.util.Scanner;

public class InputOutputIn2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[2][3];
		int m = arr.length;
		System.out.println(m);
		int n = arr[2].length;
		System.out.println(n);
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Enter element : ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
