package arrays;

public class NumberOfTriplets {

	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 5, 2, 2, 4, 5, 9, 8, 1};
		int target = 15;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						count++;
					}
				}
			}
		}
		System.out.println("Number of triplets are : " + count);
	}

}
