package sorting;

public class SortStrings {
	
	public static void print(String[] arr) {
		for(String ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] arr = {"banana", "apple", "grape", "cherry", "fig"};
		print(arr);
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if(arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if(flag) break;
		}
		
		System.out.print("Sorted array is: ");
		print(arr);
		
	}

}
