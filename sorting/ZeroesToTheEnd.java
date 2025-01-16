package sorting;

public class ZeroesToTheEnd {
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		int n =arr.length;
		print(arr);
		
		int noOfZeroes = 0;
		for(int ele : arr) {
			if(ele == 0) noOfZeroes++;
		}
		
		for (int i = 0; i < noOfZeroes; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(arr[j] == 0) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		print(arr);
		
	}

}
