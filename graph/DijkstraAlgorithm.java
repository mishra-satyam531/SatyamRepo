package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Duo implements Comparable<Duo>{
	int node;
	int dist;
	public Duo(int node, int dist) {
		this.node = node;
		this.dist = dist;
	}
	public int compareTo(Duo d) {
		return this.dist - d.dist;
	}
}
public class DijkstraAlgorithm {

	public static void main(String[] args) {
		List<List<Duo>> adj = new ArrayList<>();
		int n = 5;
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(new Duo(1, 30)); adj.get(0).add(new Duo(4, 5)); adj.get(0).add(new Duo(3, 20));
		adj.get(1).add(new Duo(0, 30)); adj.get(1).add(new Duo(2, 4));
		adj.get(2).add(new Duo(1, 4)); adj.get(2).add(new Duo(3, 7)); adj.get(2).add(new Duo(4, 8));
		adj.get(3).add(new Duo(0, 20)); adj.get(3).add(new Duo(2, 7)); adj.get(3).add(new Duo(4, 6));
		adj.get(4).add(new Duo(0, 5)); adj.get(4).add(new Duo(2, 8)); adj.get(4).add(new Duo(3, 6));
		
		int[] minDist = new int[n];
		for (int i = 1; i < minDist.length; i++) {
			minDist[i] = Integer.MAX_VALUE;
		}
		PriorityQueue<Duo> minHeap = new PriorityQueue<>();
		minHeap.add(new Duo(0, 0));
		while(!minHeap.isEmpty()) {
			Duo front = minHeap.poll();
			if (front.dist > minDist[front.node]) continue;
			for(Duo ele : adj.get(front.node)) {
				int distance = front.dist + ele.dist;
				if(minDist[ele.node] > distance) {
					minHeap.add(new Duo(ele.node, distance));
					minDist[ele.node] = distance;
				}
			}
		}
		for(int ele : minDist) {
			System.out.print(ele + " ");
		}
	}

}
