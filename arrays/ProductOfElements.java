package arrays;

import java.util.Scanner;

public class ProductOfElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter element: ");
			arr[i] = scan.nextInt();
		}
		int product = 1;
		for(int i=0; i<arr.length; i++) {
			product *= arr[i];
		}
		System.out.println("Product of the given array is: " + product);
	}

}
