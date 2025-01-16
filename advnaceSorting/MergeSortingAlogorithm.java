package advnaceSorting;

public class MergeSortingAlogorithm {
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	public static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] > b[j]) c[k++] = b[j++];
			else c[k++] = a[i++];
		}
		while(j < b.length) {
			c[k++] = b[j++];
		}
		while(i < a.length) {
			c[k++] = a[i++];
		}
	}
	
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		if(n == 1) return; //base case
//		creating two arrays of n/2 size each
		int[] a = new int[n / 2];
		int[] b = new int[n - n / 2];
		
//		copy pasting
		for (int i = 0; i < a.length; i++) {
			a[i] = arr[i];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = arr[n / 2 + i];
		}
		
//		magic
		mergeSort(a);
		mergeSort(b);
		
//		merge these 'a' and 'b'
		merge(a,b,arr);
		
//		delete a and b
		a = null; b = null;
	}

	public static void main(String[] args) {
		int[] arr = {80, 10, 70, 30, 60, 40, 50, 20};
		print(arr);
		mergeSort(arr);
		print(arr);
	}
//	TC = O(nlogn)
//	SC = O(n) after modification
//	It is a stable sort (only if in merge method the condition is a[i] <= b[j] ans not <
}
