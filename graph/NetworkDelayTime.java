package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

	public static void main(String[] args) {

	}
	public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Duo>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
			adj.add(new ArrayList<>());
		}
        for (int i = 0; i < times.length; i++) {
			adj.get(i).add(new Duo(times[i][1], times[i][2]));
		}
        for(int i = 0; i < adj.size(); i++) {
        	for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j).node + " " + adj.get(i).get(j).dist);
			}
        	System.out.println();
        }
        int[] minDelay = new int[n+1];
        PriorityQueue<Duo> pq = new PriorityQueue<>();
        pq.add(new Duo(k, 0));
        while(!pq.isEmpty()) {
        	Duo min = pq.poll();
        	if(minDelay[min.node] < min.dist) continue;
         	for(Duo ele : adj.get(min.node)) {
        		int time = min.dist + ele.dist;
        		if(minDelay[ele.node] > time) {
        			minDelay[ele.node] = time;
        			pq.add(new Duo(ele.node, time));
        		}
        	}
        }
        for(int ele : minDelay) {
        	System.out.print(ele + " ");
        }
        int minDelayTime = Integer.MIN_VALUE;
        for (int i = 1; i < n+1; i++) {
        	if(minDelay[i] == -1) return -1;
			minDelayTime = Math.max(minDelayTime, minDelay[i]);
		}
        return minDelayTime;
    }

}
