package graph;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionDirectedGraphDFS {

	private static boolean dfs(int i, boolean[] isVisited, boolean[] path, List<List<Integer>> adj) {
		isVisited[i] = true;
		path[i] = true;
		for(int ele : adj.get(i)) {
			if(path[ele]) return true; //cycle detected as ele is in same path
			if(!isVisited[ele]) if(dfs(ele, isVisited, path, adj)) return true;
		}
		path[i] = false; //backtracking
		return false;
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
		
		boolean[] isVisited = new boolean[n];
		boolean[] path = new boolean[n];
		boolean hasCycle = false;
		for (int i = 0; i < n; i++) {
			if (!isVisited[i] && dfs(i, isVisited, path, adj)) {
                hasCycle = true;
                break;
            }
		}
		 if (hasCycle) System.out.println("Cycle Detected");
	     else System.out.println("No Cycle Detected");
	}

}
