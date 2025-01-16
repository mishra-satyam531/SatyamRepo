package conditionals;

import java.util.Scanner;

public class CartesianPlane {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x-coordinate");
		int x = scan.nextInt();
		System.out.println("Enter y-coordinate");
		int y = scan.nextInt();
		
		if ((x>0) && (y>0)) {
			System.out.println("(" + x + ", " + y + ") lies in 1st quadrant");
		}else if ((x<0) && (y>0)) {
			System.out.println("(" + x + ", " + y + ") lies in 2nd quadrant");
		}else if ((x<0) && (y<0)) {
			System.out.println("(" + x + ", " + y + ") lies in 3rd quadrant");
		}else if((x>0) && (y<0)) {
			System.out.println("(" + x + ", " + y + ") lies in 4th quadrant");
		}else if ((x==0) && (y!=0)) {
			System.out.println("(" + x + ", " + y + ") lies at Y-axis");
		}else if ((y==0) && (x!=0)) {
			System.out.println("(" + x + ", " + y + ") lies at x-axis");
		}else {
			System.out.println("(" + x + ", " + y + ") lies at origin");
		}
	}

}
