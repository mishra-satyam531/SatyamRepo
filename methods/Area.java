package methods;

import java.util.Scanner;

public class Area {
	
	public static double areaOfCircle(float r) {
		double area = 3.141592*r*r;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		float r = scan.nextFloat();
		double area = areaOfCircle(r);
		System.out.println("Area of circle with radius " + r + " is " + area);
		
	}

}
