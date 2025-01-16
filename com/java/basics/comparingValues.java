package com.java.basics;

import java.util.Scanner;

public class comparingValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		if((n%3 == 0) || (n%5 == 0)) {
			System.out.println(n + " is divisible by either 3 or 5, or both");
		}else {
			System.out.println(n + " is neither divisible by 3 nor 5");
		}
	}

}
