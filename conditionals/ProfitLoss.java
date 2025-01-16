package conditionals;

import java.util.Scanner;

public class ProfitLoss {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cost price: ");
		int cp = scan.nextInt();
		System.out.println("Enter selling price: ");
		int sp = scan.nextInt();
		if(cp<sp) {
			System.out.println("You have made profit of Rs " + (sp-cp));
		}else if(cp>sp) {
			System.out.println("You have incurred loss of Rs " + (cp-sp));
		}else {
			System.out.println("NO PROFIT OR LOSS");
		}
	}

}
