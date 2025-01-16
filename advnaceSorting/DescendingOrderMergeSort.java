package advnaceSorting;

public class DescendingOrderMergeSort {
	
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	public static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k= 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) c[k++] = b[j++];
			else c[k++] = a[i++];
		}
		while(i < a.length) {
			c[k++] = a[i++];
		}
		while(j < b.length) {
			c[k++] = b[j++];
		}
	}
	
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		if(n == 1) return;
		int[] a = new int[n / 2];
		int[] b = new int[n - n /2];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = arr[i];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = arr[n / 2 + i];
		}
		
		mergeSort(a);
		mergeSort(b);
		
		merge(a, b ,arr);
	}

	public static void main(String[] args) {
		int[] arr = {8, 6, 7, 0, 6, 3, 4, 6, 6, 7, 4};
		print(arr);
		
		mergeSort(arr);
		
		print(arr);
	}

}
