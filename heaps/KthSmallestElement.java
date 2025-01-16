package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = {10,2,3,8,-4,-2,6};
		int k = 5;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) { //TC : O(nlogn)
			pq.add(arr[i]);
		}
		
		for (int i = 1; i <= k - 1; i++) { //TC : O(klogn)
			pq.poll();
		}
		System.out.println("kth smallest element is : " + pq.peek());
		//TC : O(nlogn)
//		SC : O(n)
		
//		METHOD 2 - MAX HEAP # BETTER
		PriorityQueue<Integer> pqu = new PriorityQueue<>(Collections.reverseOrder());
		for (int ele : arr) { 
			pqu.add(ele); //TC : O(nlogk)
			if(pqu.size() > k) pqu.poll(); //TC : O((n - k)logk)
		}
		System.out.println("kth smallest element is : " + pq.peek());
//		TC : O((2n - k)logk) = O(nlogk)
//		SC : O(k)
	}

}
