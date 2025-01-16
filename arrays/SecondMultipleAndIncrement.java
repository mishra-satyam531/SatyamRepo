package arrays;

public class SecondMultipleAndIncrement {

	public static void main(String[] args) {
		int[] arr = {5, 4, 5, 9, 7, 6, 4, 2, 2, 4, 6};
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				arr[i] += 10;
			}else {
				arr[i] *= 2; 
			}
		}
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
