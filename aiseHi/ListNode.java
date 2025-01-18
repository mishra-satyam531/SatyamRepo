package aiseHi;

import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//public class ListNode implements Comparable<ListNode>{
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      
//      public int compareTo(ListNode n) {
//  		return this.val - n.val;
//  	}
//}	
public class ListNode{
 	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 		 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[][] arr = new int[n][n];
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 arr[i][j] = sc.nextInt();
             }
         }
         for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
        int i = 0, j = n-1;
        while(i <= j) {
        	
        }
    }
}
class Pair {
	int node; 
	int parent;
	Pair(int node, int parent) {
		this.node = node;
		this.parent = parent;
	}
}
class Solution {
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