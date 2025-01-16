package sorting;

public class DecreasingOrderUsingBuubleSort {
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 5, 4};
		print(arr);
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			boolean flag = true;
			for (int j = 0; j < n-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			if(flag) break;
		}
		print(arr);
	}

}
