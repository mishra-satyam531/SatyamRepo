package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String[] args) {

	}
	private void kahnsAlgo(List<List<Integer>> adj, int[] indegree, List<Integer> topo) {
		int n = indegree.length;
		Queue<Integer> q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
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
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int n = prerequisites.length;
        List<List<Integer>> adj = new ArrayList<>();//adjacency list
        for (int i = 0; i < numCourses; i++) {
			adj.add(new ArrayList<>());
		}
        for (int i = 0; i < n; i++) {
			adj.get(prerequisites[i][1]).add(prerequisites[i][0]);//we have to complete second course to do first one
		}
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
			for(int ele : adj.get(i)) indegree[ele]++;
		}
        List<Integer> topo = new ArrayList<>();
        kahnsAlgo(adj, indegree, topo);
        return (topo.size() == adj.size()) ? true : false;
    }
}
