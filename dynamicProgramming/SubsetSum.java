package dynamicProgramming;

import java.util.Arrays;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {0,8,5,2,4};
		int n = arr.length;
		int target = 9;
		int[][] dp = new int[n][target+1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(subset(0, arr, target, dp));
	}

	private static boolean subset(int i, int[] arr, int tar, int[][] dp) {
		if(i == arr.length) {
			if(tar == 0) return true;
			return false;
		}
		if(dp[i][tar] != -1) return (dp[i][tar] == 1);
		boolean ans = false;
		boolean skip = subset(i+1, arr, tar, dp);
		if(arr[i] > tar) ans = skip; //only valid if all the numbers are +ve
		else {
			boolean take = subset(i+1, arr, tar-arr[i], dp);
			ans = take || skip	;
		}
		if(ans) dp[i][tar] = 1;
		else dp[i][tar] = 0;
		return ans;
	}
}
