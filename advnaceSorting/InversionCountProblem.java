package advnaceSorting;

public class InversionCountProblem {
	
	static int count;
	
	public static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] > b[j]) {
				c[k++] = b[j++];
				count += a.length - i;
			}
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
		if(n == 1) return;
		
		int[] a = new int[n / 2];
		int[] b = new int[n - n / 2];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = arr[i];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = arr[n / 2 + i];
		}
		
		mergeSort(a);
		mergeSort(b);
		
//		int i = 0, j = 0;
//		while(i < a.length && j < b.length) {
//			if(a[i] > b[j]) {
//				count += a.length - i;
//				j++;
//			}else {
//				i++;
//			}
//		}
		
		merge(a, b, arr);
		
		a = null; b = null;
	}

	public static void main(String[] args) {
		int[] arr = {8, 2, 5, 3, 1, 4};
		count = 0;
		
		mergeSort(arr);
		
		System.out.println(count);
	}

}
