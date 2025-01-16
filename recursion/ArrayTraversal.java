package recursion;

public class ArrayTraversal {
	
	public static void traverse(int[] arr, int n) {
		if(n < 0) return;
		traverse(arr, n - 1);
		System.out.print(arr[n] + " ");
	}

	public static void main(String[] args) {
		int[] arr = {4, 7, 1, 3, 0, 5, 8, 4, 9};
		int n = arr.length;
		
		traverse(arr, n -1);
	}

}
