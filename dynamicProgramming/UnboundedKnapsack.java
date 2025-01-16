package dynamicProgramming;

import java.util.Arrays;

public class UnboundedKnapsack {

	private static int profit(int i, int[] val, int[] wt, int c, int[][] dp) {
		if(i == wt.length) return 0;
		if(dp[i][c] != -1) return dp[i][c];
		int skip = profit(i+1, val, wt, c, dp);
		if(wt[i] > c) return dp[i][c] = skip;
		int take = val[i] + profit(i, val, wt, c - wt[i], dp);
		return dp[i][c] = Math.max(take, skip);
	}
	
	public static void main(String[] args) {
		int[] val = {6, 3, 7, 25};
		int[] weight = {3, 2, 8, 9};
		int C = 9; //capacity
		int n = weight.length;
		int[][] dp = new int[n][C+1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(profit(0, val, weight, C, dp));
	}

}
