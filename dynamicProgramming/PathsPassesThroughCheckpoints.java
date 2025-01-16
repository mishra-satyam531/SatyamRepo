package dynamicProgramming;

public class PathsPassesThroughCheckpoints {

	public static void main(String[] args) {
		int row = 7;
		int col = 6;
		int[][] checkpoint = {{2, 1}, {5,2}, {6,5}};//last element is the destination
		
		int[][] dp = new int[row][col];
		int n = checkpoint.length;
		dp[0][0] = 1;
		int ix = 0;
		int rx = 0;
		int cx = 0;
		for(int i = 0; i < n; i++) {
			int r = checkpoint[ix][0];
			int c = checkpoint[ix][1];
			for(int m = rx+1; m <= r; m++) {
				dp[m][cx] = dp[rx][cx];
			}
			for(int j = cx+1; j <= c;j++) {
				dp[rx][j] = dp[rx][cx];
			}
			ix++;
			for(int j = rx+1; j <= r; j++) {
				for(int k = cx+1; k <= c; k++) {
					dp[j][k] = dp[j-1][k] + dp[j][k-1];
				}
			}
			rx = r;
			cx = c;
		}
		System.out.println(dp[row-1][col-1]);
	}
}