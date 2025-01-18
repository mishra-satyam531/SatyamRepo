package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class IsGraphBipartite {

	public static void main(String[] args) {
		
	}
	private boolean bfs(int i, int[] isVisited, int[][] graph) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(i);
		while(!q.isEmpty()) {
			int front = q.poll();
			int color = isVisited[front]; //2 colors -> 1 and 2
			for(int ele : graph[front]) {
				if(isVisited[ele] == 0) {
					q.add(ele);
					isVisited[ele] = (color == 1) ? 2 : 1;
				}else if(isVisited[ele] == isVisited[front]) return false;
			}
		}
		return true;
	}
	private boolean dfs(int i, int[] isVisited, int[][] graph) {
		int color = isVisited[i];
		for(int ele : graph[i]) {
			if(isVisited[ele] == 0) {
				isVisited[ele] = (color == 1) ? 2 : 1;
				if(!dfs(i, isVisited, graph)) return false;
			}else if(isVisited[ele] == isVisited[i]) return false;
		}
		return true;
	}
    public boolean isBipartite(int[][] graph) {
    	int n = graph.length;
        int[] isVisited = new int[n];
        for (int i = 0; i < n; i++) {
			if(isVisited[i] == 0) {
//				if(!bfs(i, isVisited, graph)) return false;
				if(!dfs(i, isVisited, graph)) return false;
			}
		}
        return true;
    }
}
