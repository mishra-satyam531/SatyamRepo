package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {
	
//	LeetCode 22
	static ArrayList<String> arr;
	public static void parenthesis(int openBra, int closedBra, int n, String ans) {
		if(openBra > n ||closedBra > openBra) return;
		if(ans.length() == 2*n) {
			arr.add(ans);
			return;
		}
		parenthesis(openBra + 1,closedBra, n, ans + '(');
		parenthesis(openBra, closedBra + 1, n, ans + ')'	);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of parenthesis: ");
		int n = scan.nextInt();
		arr = new ArrayList<>();
		
		parenthesis(0, 0, n, "");
		System.out.println(arr);

	}

}
