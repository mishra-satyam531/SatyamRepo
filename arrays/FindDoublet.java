package arrays;

import java.util.Scanner;

public class FindDoublet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = scan.nextInt();
		
		System.out.print("Enter sum you want to find: ");
		int sum = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter element : ");
			arr[i] = scan.nextInt();
		}
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					flag = true;
					System.out.println(arr[i] + " and " + arr[j]);
					break;
				}
			}
			if(flag) {
				break;
			}
		}
	}

}
