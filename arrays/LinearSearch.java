package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Enter target element: ");
		int x = scan.nextInt();
		
		for(int i=0; i<=n-1; i++) {
			System.out.print("Enter element: ");
			arr[i] = scan.nextInt();
	    }
		
		boolean flag = false;
		for(int i=0; i<=n-1; i++) {
			if(arr[i] == x) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.print("Element Found");
		}else {
			System.out.println("Element NOT Found");
		}
	}

}
