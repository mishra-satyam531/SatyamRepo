package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Double{
	int node;
	int price;
	public Double(int node, int price) {
		this.node = node;
		this.price = price;
	}
}
class Triple implements Comparable<Triple>{
	int node;
	int parent;
	int price;
	public Triple(int node, int parent, int price) {
		this.node = node;
		this.parent = parent;
		this.price = price;
	}
	public int compareTo(Triple t) {
		return this.price - t.price;
	}
	
}
public class PrimsAlgorithm {
//	PRIM'S ALGORITHM
//	MINIMUM SPANNING TREE
	public static void main(String[] args) {
		int n = 5;
		List<List<Double>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(new Double(4, 1)); adj.get(0).add(new Double(2, 5)); adj.get(0).add(new Double(1, 2));
		adj.get(1).add(new Double(0, 2)); adj.get(1).add(new Double(4, 3)); adj.get(1).add(new Double(3, 1));
		adj.get(2).add(new Double(0, 5)); adj.get(2).add(new Double(3, 5));	adj.get(2).add(new Double(4, 2));
		adj.get(3).add(new Double(2, 5)); adj.get(3).add(new Double(1, 1)); adj.get(3).add(new Double(4, 4));
		adj.get(4).add(new Double(0, 1)); adj.get(4).add(new Double(2, 2));
		adj.get(4).add(new Double(1, 3)); adj.get(4).add(new Double(3, 4));
		int minSum = 0;
		boolean[] isVisited = new boolean[n];
		List<Triple> mst = new ArrayList<>();
		PriorityQueue<Triple> q = new PriorityQueue<>();
		q.add(new Triple(0, -1, 0));
		while(!q.isEmpty()) {
			Triple top = q.poll();
			if (isVisited[top.node]) continue;
			isVisited[top.node] = true;
			if (top.parent != -1) {
                mst.add(top);
                minSum += top.price;
            }
			for(Double ele : adj.get(top.node)) {
				if(ele.node != top.parent && !isVisited[ele.node]) {
					q.add(new Triple(ele.node, top.node, ele.price));
				}
			}
		}
		System.out.println("Minimum Spanning Tree:");
        for (Triple edge : mst) {
            System.out.println("Node " + edge.parent + " -> Node " + edge.node + " with weight " + edge.price);
        }
        System.out.println("Minimum sum is : " + minSum);
	}

}
