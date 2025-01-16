package twoDimensionalArray;

public class SearchA2DMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
		int m = arr.length, n = arr[0].length;
		int tar = 8;
		int i = 0, j = n-1;
		boolean flag = false;
		
		while(i < m && j >= 0) {
			if(arr[i][j] == tar) {
				flag = true;
				break;
			}else if(arr[i][j] > tar) {
				j--;
			}else {
				i++;
			}
		}
		
		if(flag) {
			System.out.println("Target element found");
		}else {
			System.out.println("Target not found");
		}
	}

}
