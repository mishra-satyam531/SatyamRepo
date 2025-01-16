package dynamicProgramming;

public class Knapsack01Tabulation {

	public static void main(String[] args) {
		int[] val = {5, 3, 8, 16};
		int[] weight = {1, 2, 8, 10};
		int C = 8; //capacity
		int n = weight.length;
		int[][] dp = new int[n][C+1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < C+1; j++) {
				int skip = (i>0) ? dp[i-1][j] : 0;
				if(weight[i] > j) dp[i][j] = skip;
				else {
					int take = val[i];
					take += (i>0) ? dp[i-1][j - weight[i]] : 0;
					dp[i][j] = Math.max(take, skip);
				}
			}	
		}
		System.out.println(dp[n-1][C]);
	}

}
