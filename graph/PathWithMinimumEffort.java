package graph;

import java.util.Arrays;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>{
	int row;
	int col;
	int effort;
	Triplet(int row, int col, int effort) {
		this.row = row;
		this.col = col;
		this.effort = effort;
	}
	public int compareTo(Triplet t) {
		return this.effort - t.effort;
	}
}
public class PathWithMinimumEffort {
	public int minimumEffortPath(int[][] heights) {
		int m = heights.length, n = heights[0].length;
		int[][] ans = new int[m][n];
		for (int i = 0; i < m; i++) {
			Arrays.fill(ans[i], Integer.MAX_VALUE);
		}
		ans[0][0] = 0;
//		up-down-left-right
		int[] r = {-1,1,0,0};
		int[] c = {0,0,-1,1};
		PriorityQueue<Triplet> pq = new PriorityQueue<>();
		pq.add(new Triplet(0, 0, 0));
		while(!pq.isEmpty()) {
			Triplet rem = pq.poll();
			int row = rem.row, col = rem.col, effort = rem.effort;
			if(row == m-1 && col == n-1) return ans[m-1][n-1];
			for (int i = 0; i <= 3; i++) {
				int newRow = row + r[i];
				int newCol = row + c[i];
				if(newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) continue;
				int e = Math.abs(heights[row][col] - heights[newRow][newCol]);
				e =  Math.max(effort, e);
				if(e < ans[newRow][newCol]) {
					pq.add(new Triplet(newRow, newCol, e));
					ans[newRow][newCol] = e;
				}
			}
		}
		return ans[m-1][n-1];
    }
}
