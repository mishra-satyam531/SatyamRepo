package heaps;

import java.util.PriorityQueue;

public class SortKsortedArrayORnearlySortedAray {

	public static void main(String[] args) {
		int[] arr  = {6, 5, 3, 2, 8, 10, 9};
		int k = 3;

		int[] ans = new int[arr.length];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		for(int ele : arr) {
			pq.add(ele);
			if(pq.size() > k) ans[i++] = pq.poll();
		}
		while(pq.size() > 0) ans[i++] = pq.poll();
		for(int ele : ans) {
			System.out.print(ele + " ");
		}
	}

}
