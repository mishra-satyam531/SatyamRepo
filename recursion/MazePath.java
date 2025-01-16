package recursion;

import java.util.Scanner;

public class MazePath {
	
//	public static int maze(int i, int j, int r, int c) {
//		if(i == r || j == c) return 1;
//		int right = maze(i, j + 1, r, c);
//		int down = maze(i + 1, j, r, c);
//		return right + down;
//	}
	
	public static int maze2(int r, int c) {
		if(r == 1 || c == 1) return 1;
		int right = maze2(r, c - 1);
		int down = maze2(r - 1, c);
		return right + down;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int r = scan.nextInt();
		System.out.print("Enter number of columns: ");
		int c = scan.nextInt();
		
//		System.out.println("Number of ways are: " + maze(1, 1, r, c));
		System.out.println("Number of ways are: " + maze2(r, c));

	}

}
