package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CycleDetectionDirectedGraphBFS {
//	KAHN'S ALGORITHM
	private static void bfs(List<List<Integer>> adj, List<Integer> topo, int[] indegree) {
		int n = indegree.length;
		Queue<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			if(indegree[i] == 0) q.add(i);
		}
		while(!q.isEmpty()) {
			int front = q.poll();
			topo.add(front);
			for(int ele : adj.get(front)) {
				indegree[ele]--;
				if(indegree[ele] == 0) q.add(ele);
			}
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> adj = new ArrayList<>();
		int n = 6;
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(3); adj.get(0).add(2);
		adj.get(1).add(2); adj.get(1).add(4);
		adj.get(3).add(2);
		adj.get(4).add(5); adj.get(4).add(3); adj.get(4).add(2);
		adj.get(5).add(1);
		
		List<Integer> topo = new ArrayList<>();
		int[] indegree = new int[n];
		for (int i = 0; i < n; i++) {
			for(int ele : adj.get(i)) indegree[ele]++;
		}
		bfs(adj, topo, indegree);
		if(topo.size() != n) System.out.println("Cycle Detected");
		else System.out.println("No cycle Detected");
	}
}