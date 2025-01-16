package strings;

import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		System.out.print("Enter target element in the string: ");
		char target = scan.next().charAt(0);
		
		System.out.println(s.indexOf(target)); //Returns the first index and if element is not present then it returns -1
		System.out.println(s.lastIndexOf(target)); //Same as IndexOf but returns last element from 
	}
	

}
