package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Pair {
	int node; 
	int parent;
	Pair(int node, int parent) {
		this.node = node;
		this.parent = parent;
	}
}
public class CycleDetectionBFS {
	public static void main(String[] args) {
		
	}
	private boolean bfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] isVisited) {
		Queue<Pair> q = new ArrayDeque<>();
		q.add(new Pair(i, -1));
		isVisited[i] = true;
		while(!q.isEmpty()) {
			Pair front = q.poll();
			for (int ele : adj.get(front.node)) {
				if(!isVisited[ele]) {
					q.add(new Pair(ele, front.node));
					isVisited[ele] = true;
				}else if(ele != front.parent) return true; //cycle detected
			}
		}
		return false;
	}
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
			if(!isVisited[i]) {
				if(bfs(i, adj, isVisited)) return true; //there is a cycle
			}
        }
        return false; //no cycle
    }

}
