package arrays;

import java.util.Scanner;

public class SmallestMissingPositiveElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter element: ");
			arr[i] = scan.nextInt();
		}
		int j = 1;
		
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] != j) {
				flag = true;
				System.out.println("Smallest missing positive element is: " + j);
				break;
			}else {
				j++;
			}
		}
		if(!flag) {
			System.out.println("Smallest missing positive element is: " + j);
		}
	}

}
