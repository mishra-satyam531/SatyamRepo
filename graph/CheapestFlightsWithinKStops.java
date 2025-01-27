package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		List<List<Pair>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
		for (int i = 0; i < flights.length; i++) {
			adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
		}
		int[] ans = new int[n];
		Arrays.fill(ans, Integer.MAX_VALUE);
		ans[src] = 0;
		Queue<Triplet> q = new ArrayDeque<>();
		q.add(new Triplet(src, 0, 0));
		while(!q.isEmpty()) {
			Triplet front = q.poll();
			int node = front.row, cost = front.col, stops = front.effort;
			if(stops == k+1) continue;
			for(Pair ele : adj.get(node)) {
				int totalCost = cost + ele.parent;
				if(totalCost < ans[ele.node]) {
                    ans[ele.node] = totalCost;
					q.add(new Triplet(ele.node, totalCost, stops+1));
				}
			}
		}
		if(ans[dst] == Integer.MAX_VALUE) return -1;
		return ans[dst];
    }
}
