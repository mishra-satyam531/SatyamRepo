package stringBuilders;

import java.util.Scanner;

public class ConcatetenateWithItsrReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder s = new StringBuilder(scan.nextLine());
		
		StringBuilder reversed = new StringBuilder(s).reverse();
		s.append(reversed); //can't append s.reverse() directly because the moment you reverse the string builder original string builder will not exist
		
		System.out.println("String after concatenation is: " + s);
	}

}
