package arrays;

public class NextGreatestElement {

	public static void main(String[] args) {
		int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
		int[] ans = new int[arr.length];
		
//		Method-1 Brute Force
//		for(int i=0; i<arr.length-1; i++) {
//			int max = Integer.MIN_VALUE;
//			for(int j=i+1; j<arr.length; j++) {
//				if(max<arr[j]) {
//					max = arr[j];
//				}
//			}
//			
//			ans[i] = max;
//		}
//		ans[arr.length-1] = -1;
		
		// Method-2 Optimized
		
		int max = arr[arr.length-1];
		
		for(int i=arr.length-2; i>=0; i--) {
			ans[i] = max;
			max = Math.max(max, arr[i]);
		}
		ans[arr.length-1] = -1;
		
		for(int ele : ans) {
			System.out.print(ele + " ");
		}
	}

}
