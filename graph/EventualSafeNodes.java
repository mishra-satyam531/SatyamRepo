package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class EventualSafeNodes {

	public static void main(String[] args) {

	}
	public List<Integer> eventualSafeNodes(int[][] graph) {
		int n = graph.length;
        int[] outdegree = new int[n]; //outdegree array to find terminal nodes
        // finding incoming edges for a vertex
        List<List<Integer>> incomingEdges = new ArrayList<>();
        for (int i = 0; i < n; i++) incomingEdges.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            outdegree[i] = graph[i].length;
			for (int ele : graph[i]) {
//				in original graph, edge is from i to ele
//				in reverse graph, it will be from ele to i
				incomingEdges.get(ele).add(i);
			}
		}
        // kahn's algo
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
			if(outdegree[i] == 0) queue.add(i);
		}
        List<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
        	int currentNode = queue.poll();
        	ans.add(currentNode);
        	for(int neighbour : incomingEdges.get(currentNode)) {
        		outdegree[neighbour]--;
        		if(outdegree[neighbour] == 0) queue.add(neighbour);
        	}
        }
        Collections.sort(ans);
        return ans;
    }
}
