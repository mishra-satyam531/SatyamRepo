package conditionals;

import java.util.Scanner;

public class YoungestOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age of Ram: ");
		int r = scan.nextInt();
		System.out.println("Enter age of Shyam: ");
		int s = scan.nextInt();
		System.out.println("Enter third Ajay: ");
		int a = scan.nextInt();
		
		if ((r==s) && (s==a)) {
			System.out.println("All three are of equal age");
		}else if ((r==s)&&(r<a)) {
			System.out.println("Age of Ram and Shyam are equal and they are youngest");
		}else if ((r==s)&&(r>a)) {
			System.out.println("Ajay is youngest");
		}else if ((r==a)&&(r<s)) {
			System.out.println("Age of Ram and Ajay are equal and they are youngest");
		}else if ((r==a)&&(r>s)) {
			System.out.println("Shyam is youngest");
		}else if ((s==a)&&(s<r)) {
			System.out.println("Age of Shyam and Ajay are equal and they are youngest");
		}else if ((s==a)&&(s>r)) {
			System.out.println("Ram is youngest");
		}else {
			if (r<s) {
				if (r<a) {
					System.out.println("Ram is youngest");
				}else {
					System.out.println("Ajay is youngest");
				}
			}else {
				if (s<a) {
					System.out.println("Shyam is youngest");
		        }else {
					System.out.println("Ajay is youngest");
				}
			}
		}
	}

}
