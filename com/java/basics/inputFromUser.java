package com.java.basics;
import java.util.Scanner;
public class inputFromUser {

	public static void main(String[] args) {
		//Area of a circle
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		float r = scan.nextFloat();
		System.out.println("Area of circle is: " + 3.141592*r*r);
		
		//Simple Interest
		System.out.println("Enter principal amount: ");
		float p = scan.nextFloat();
		System.out.println("Enter rate of interest: ");
		float R = scan.nextFloat();
		System.out.println("Enter time (in years): ");
		float t = scan.nextFloat();
		System.out.println("Simple interest: " + (p * R * t)/100);
		scan.close();
	}
} 	