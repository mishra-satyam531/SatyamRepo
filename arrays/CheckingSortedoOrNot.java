package arrays;

public class CheckingSortedoOrNot {

	public static void main(String[] args) {
		int arr[] = {2, 4, 5, 16, 10, 9, 15};
		int max = Integer.MIN_VALUE;
		boolean flag = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=max) {
				max = arr[i];
			}else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
	}

}
