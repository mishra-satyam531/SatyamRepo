package arrays;

public class Sort0s1s2s {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
		int n = arr.length;
//		int noOfZeroes = 0, noOfOnes = 0;
//		
//		for(int i=0; i<n; i++) {
//			if(arr[i] == 0) {
//				noOfZeroes++;
//			}else if(arr[i] == 1) {
//				noOfOnes++;
//			}
//		}
//		
//		for(int i=0; i<n; i++) {
//			if(i<noOfZeroes) {
//				arr[i] = 0;
//		    }else if(i<noOfZeroes+noOfOnes) {
//		    	arr[i] = 1;
//		    }else {
//		    	arr[i] = 2;
//		    }
//		
//		}
//		for(int ele : arr) {
//			System.out.print(ele + " ");
//		}
		
		int low=0, mid=0, high=n-1;
		while(mid<=high) {
			if(arr[mid] == 0) {
				swap(arr, low, mid);
				low++; mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr, mid, high);
				high--;
			}
		}
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
