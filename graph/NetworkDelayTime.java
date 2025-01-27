package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

	public static void main(String[] args) {

	}
	public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Duo>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {//nodes are from 1 to n and not from 0 to n-1
			adj.add(new ArrayList<>());
		}
        for (int i = 0; i < times.length; i++) {
			adj.get(times[i][0]).add(new Duo(times[i][1], times[i][2]));
		}
        int[] minDelay = new int[n+1];
        for (int i = 1; i < n+1; i++) {
        	if(i == k) continue;
			minDelay[i] = Integer.MAX_VALUE;
		}
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
        int minDelayTime = Integer.MIN_VALUE;
        for (int i = 1; i < n+1; i++) {//0 node is not present in ques
        	if(minDelay[i] == Integer.MAX_VALUE) return -1;
			minDelayTime = Math.max(minDelayTime, minDelay[i]);
		}
        return minDelayTime;
    }

}
