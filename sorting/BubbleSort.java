package sorting;

public class BubbleSort {
	
//	STABLE SORT
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {-5, 4, 0, 7, 2, 3};
		int n = arr.length;
		print(arr);
		
		for (int i = 0; i < n-1; i++) { // n-1 passes
			for (int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}
		print(arr);
	}

}
