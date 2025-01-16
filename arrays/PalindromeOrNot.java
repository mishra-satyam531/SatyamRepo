package arrays;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 4, 4, 3, 2, 1};
		int i=0, j=arr.length-1;
		boolean flag = true;
		
		while(i<j) {
			if(arr[i] == arr[j]) {
				i++; j--;
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Given array is a palindrome");
		}else {
			System.out.println("Given array is not a palindrome");
		}
	}

}
