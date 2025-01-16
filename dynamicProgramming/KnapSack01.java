package dynamicProgramming;

import java.util.Arrays;

public class KnapSack01 {

	private static int profit(int i, int[] val, int[] wt, int c, int[][] dp) {
		if(i == wt.length) return 0;
		if(dp[i][c] != -1) return dp[i][c];
		int skip = profit(i+1, val, wt, c, dp);
		if(wt[i] > c) return dp[i][c] = skip;
		int take = val[i] + profit(i+1, val, wt, c - wt[i], dp);
		return dp[i][c] = Math.max(take, skip);
	}
	
	public static void main(String[] args) {
		int[] val = {5, 3, 8, 16};
		int[] weight = {1, 2, 8, 10};
		int C = 8; //capacity
		int n = weight.length;
		int[][] dp = new int[n][C+1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(profit(0, val, weight, C, dp));
	}
}