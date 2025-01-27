package graph;

import java.util.Arrays;

public class BellmanFordAlgorithm {

	public static void main(String[] args) {
		
	}
	public int networkDelayTime(int[][] times, int n, int k) {
    	int[] minTime = new int[n+1];
    	Arrays.fill(minTime, Integer.MAX_VALUE);
    	minTime[k] = 0;
    	// Relax edges n-1 times
    	for (int i = 1; i <= n-1; i++) {
			for (int j = 0; j < times.length; j++) {
				int u = times[j][0];
				int v = times[j][1];
				int wt = times[j][2];
				if(minTime[u] != Integer.MAX_VALUE && minTime[u] + wt < minTime[v]) {
					minTime[v] = minTime[u] + wt;
				}
			}
		}
        // Check for negative cycles
    	for (int j = 0; j < times.length; j++) {
			int u = times[j][0];
			int v = times[j][1];
			int wt = times[j][2];
			if(minTime[u] != Integer.MAX_VALUE && minTime[u] + wt < minTime[v]) {
				System.out.println("NEGATIVE CYCLE DETECTED");
				return -1;
			}
		}
    	int ans = 0;
    	for (int i = 1; i <= n; i++) {
			if(minTime[i] == Integer.MAX_VALUE) return -1;
			ans = Math.max(ans, minTime[i]);
		}
		return ans;
    }
}