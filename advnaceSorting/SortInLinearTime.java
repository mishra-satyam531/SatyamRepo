package advnaceSorting;

public class SortInLinearTime {
//Given an array where all its elements are sorted in increasing order except two swapped 
//elements, sort it in linear time. Assume there are no duplicates in the array.

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 6, 8, 9, 10};
	    int first = -1, second = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				if(first == -1) first = i;
				else if(second == -1) {
					second = i + 1;
					break;
				}
			}
		}
		
        if (first != -1 && second != -1) {
            swap(arr, first, second);
        } else if (second == -1) {  // Handle adjacent swaps
            swap(arr, first, first + 1);
        }
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
