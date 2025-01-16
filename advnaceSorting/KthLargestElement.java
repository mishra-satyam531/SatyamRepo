package advnaceSorting;

public class KthLargestElement {
	
//	LeetCode 215	
	static int ans;
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		int pivot = arr[mid];
		int smallCount = 0;
		for(int i = low; i <= high; i++) {
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
				swap(arr, i ,j);
				i++; j--;
			}
		}
		return correctIdx;
	}
	
	public static void quickSelect(int[] arr, int low, int high, int k) {
		if(low > high) return;
//		if(low == high) { not really required
//			ans = arr[low];
//			return;
//		}
		
		int idx = partition(arr, low, high);
		
		if(idx == k - 1) {
			ans = arr[idx];
			return;
		}
		if(idx > k - 1) quickSelect(arr, low, idx - 1, k);
		else quickSelect(arr, idx + 1, high, k);
	}

	public static void main(String[] args) {
		int[] arr = {4, 2, 5, 9, 1, 8};
		int k = 4;
		
		ans = -1;
		int n = arr.length;
		
		quickSelect(arr, 0, n - 1, n - k + 1);
		
		System.out.println(ans);
	}

}
