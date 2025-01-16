package arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int n = arr.length;
//		for(int i=0; i<n/2; i++) {
//			int j = n-i-1; 
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;	
//		}
//		for(int ele : arr) {
//			System.out.print(ele + " ");
		
		int i=0, j=n-1;
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
