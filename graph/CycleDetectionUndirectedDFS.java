package graph;

import java.util.ArrayList;

public class CycleDetectionUndirectedDFS {
	public static void main(String[] args) {
		
	}
	private boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] isVisited) {
		isVisited[node] = true;
		for (int ele : adj.get(node)) {
			if(!isVisited[ele]) {
				if(dfs(ele, node, adj, isVisited)) return true; // cycle detected
			}else if(ele != parent) return true; // cycle detected
		}
		return false;
	}
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
			if(!isVisited[i]) {
				if(dfs(i, -1, adj, isVisited)) return true; //there is a cycle
			}
        }
        return false; //no cycle
    }
}