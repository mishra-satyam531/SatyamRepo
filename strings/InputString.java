package strings;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter your name: ");
		 String s = scan.nextLine();
		 System.out.println("Hi " + s + "! We are learning Java here.");
	}

}
