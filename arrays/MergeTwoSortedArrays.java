package arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = {11, 33, 42, 71};
		int[] b = {26, 64, 69, 81, 93};
		
		int n1 = a.length;
		int n2 = b.length;
		int[] arr = new int[n1+n2];
		
//		int i=0, j=0, k=0;
//		while(i<n1 && j<n2) {
//			if(a[i]<b[j]) {
//				arr[k] = a[i];
//				i++;
//			}else {
//				arr[k] = b[j];
//				j++;
//			}
//			k++;
//		}
//		
//		if(i==n1) {
//			for(;j<n2; j++) {
//				arr[k] = b[j];
//				k++;
//			}
//		}else if(j==n2) {
//			for(;i<n1;i++) {
//				arr[k] = a[i];
//				k++;
//			}
//		}
		
		int i=n1-1, j=n2-1, k=n1+n2-1;
		
		while(i>=0 && j>=0) {
			if(a[i]>b[j]) {
				arr[k] = a[i];
				i--;
			}else {
				arr[k] = b[j];
				j--;
			}
			k--;	
			
		}
		
		if(i<0) {
			for(;j>=0;j--) {
				arr[k] = b[j];
				k--;
			}
		}else if(j<0) {
			for(;i>=0;i--) {
				arr[k] = a[i];
				k--;
			}
		}
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
