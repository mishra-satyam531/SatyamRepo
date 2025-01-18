package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
//  There should not be any cycle for TopologicalSort
//	Can put a check to verify if there is a cycle or not
//	DAG - DIRECTED ACYCLIC GRAPH
	private static void dfs(int i, List<List<Integer>> adj, boolean[] isVisited, List<Integer> sort) {
		isVisited[i] = true;
		for (int ele : adj.get(i)) {
			if(!isVisited[ele]) dfs(ele, adj, isVisited, sort);
		}
		sort.add(i);
	}
	
	private static void kahnsAlgo(int[] indegree, List<List<Integer>> adj, List<Integer> sorted) {
		Queue<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < indegree.length; i++) {
			if(indegree[i] == 0) q.add(i);
		}
		
		while(!q.isEmpty()) {
			int front = q.poll();
			sorted.add(front);
			for (int ele : adj.get(front)) {
				indegree[ele]--;
				if(indegree[ele] == 0) q.add(ele); 
			}
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    adj.add(new ArrayList<>());
		}
		adj.get(0).add(1);
		adj.get(2).add(3);
		
		List<Integer> sort = new ArrayList<>();
		boolean[] isVisited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if(!isVisited[i]) {
				dfs(i, adj, isVisited, sort);
			}
		}
		System.out.println(sort.reversed());
		
//		KAHN'S ALGORITHM (BFS)
		List<Integer> sorted = new ArrayList<>();
		int[] indegree = new int[n];
		for (int i = 0; i < n; i++) {
			for(int ele : adj.get(i)) indegree[ele]++;
		}
		kahnsAlgo(indegree, adj, sorted);
		System.out.println(sorted);
	}

}
