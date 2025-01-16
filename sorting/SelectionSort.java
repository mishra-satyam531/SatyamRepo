package sorting;

public class SelectionSort {
	
//	UNSTABLE SORT
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {-10, 4, 20, 1, 8, -6};
		print(arr);
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			int min = Integer.MAX_VALUE;
			int mindx = 0; //Index of min element
			for (int j = i; j < n; j++) {
				if(min > arr[j]) {
					min = arr[j];
					mindx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mindx];
			arr[mindx] = temp;
		}
		
		print(arr);
	}

}
