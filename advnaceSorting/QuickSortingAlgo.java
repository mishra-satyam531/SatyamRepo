package advnaceSorting;

public class QuickSortingAlgo {
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		int pivot = arr[mid];
		int smallCount = 0;
		for (int i = low; i <= high; i++) {
			if(i == mid) continue;
			if(arr[i] <= pivot) smallCount++;
		}
		
		int correctIdx = low + smallCount;
		swap(arr, mid, correctIdx);
		
		int i = low, j = high;
		while(i < correctIdx && j > correctIdx) {
			if(arr[i] <= pivot) i++;
			else if(arr[j] > pivot) j--;
			else if(arr[i] > pivot && arr[j] < pivot) {
				swap(arr, i, j);
				i++; j--;
			}
		}
		return correctIdx;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low >= high) return;
		
		int idx = partition(arr, low, high);
		
		quickSort(arr, low, idx - 1);
		quickSort(arr, idx + 1, high);
	}

	public static void main(String[] args) {
		int[] arr = {8, 2, 5, 3, 1, 4};
		int n = arr.length;
		
		quickSort(arr, 0, n - 1);	
		
		print(arr);
	}

}
