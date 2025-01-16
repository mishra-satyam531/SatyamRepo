package arrays;


public class RotateTheArray {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
//		int[] ans = new int[arr.length];
		int n = arr.length;
		int k = 3;
		k %= n;
		
//		int j=0;
//		
//		for(int i=n-k; i<=n-1; i++) {
//			ans[j] = arr[i];
//			j++;
//		}
//		
//		for(int i=0; i<=n-k-1; i++) {
//			ans[j] = arr[i];
//			j++;
//		}
//		
//		for(int ele : ans) {
//			System.out.print(ele + " ");
//		}
		
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
