package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {

	public static void main(String[] args) {
		String[] dict = {"baa","abcd","abca","cab","cada"};
		int k = 4;
		findOrder(dict, k);
	}
	public static String findOrder(String[] dict, int k) {
		int n = dict.length;
		List<List<Character>> adj = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			adj.add(new ArrayList<>());
		}
		for (int i = 0; i < n-1; i++) {
			int len = Math.min(dict[i].length(), dict[i+1].length());
			for (int j = 0; j < len; j++) {
				char ch1 = dict[i].charAt(j);
                char ch2 = dict[i+1].charAt(j);
                if (ch1 != ch2) {
                    adj.get(ch1 - 'a').add(ch2);
                    break;
                }
			}
		}
		System.out.println(adj);
		int[] indegree = new int[k];
		for (int i = 0; i < k; i++) {
			for(char ele : adj.get(i)) indegree[ele-97]++;
		}
		for(int ele : indegree) {
			System.out.print(ele + " ");
		}
		System.out.println();
//		KAHN'S ALGORITHM
		Queue<Character> q = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			if(indegree[i] == 0) q.add((char)(i+97));
		}
		while(!q.isEmpty()) {
			char front = q.poll();
			sb.append(front);
			for(char ele : adj.get(front-97)) {
				indegree[ele-97]--;
				if(indegree[ele-97] == 0) q.add(ele);
			}
		}
		System.out.println(sb);
		return sb.toString();
    }

}
