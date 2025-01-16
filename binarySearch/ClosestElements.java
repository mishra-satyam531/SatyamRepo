package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestElements {

	//Leetcode 658
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 9, 10};
		int n = arr.length;
		int x = 9;
		int k = 4;
		
		List<Integer> ans = new ArrayList<>();
		
		//Base Cases
		if(x < arr[0]) {
			for(int i = 0; i < k; i++) {
				ans.add(arr[i]);
			}
		}
		else if(x > arr[n - 1]) {
			for(int i = n - 1; i >= n - k; i--) {
				ans.add(arr[i]);
			}
		}
		else {
			int lb = n; 
			int low = 0, high = n - 1;
			while(low <= high) {
				int mid = low + (high - low) / 2;
				if(arr[mid] >= x) {
					lb = mid;
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}
			
			int i = lb - 1, j = lb;
			while(k > 0 && i >= 0 && j < n) {
				int di = Math.abs(arr[i] - x);
				int dj = Math.abs(arr[j] - x);
				if(di <= dj) {
					ans.add(arr[i]);
					i--;
				}else {
					ans.add(arr[j]);
					j++;
				}
				k--;
			}	
			
			while(i >= 0 && k > 0) {
				ans.add(arr[i]);
				i--;
				k--;
			}
			
			while(j < n && k > 0) {
				ans.add(arr[j]);
				j++;
				k--;
			}
		}
		
		Collections.sort(ans);
		
		for(int ele : ans) {
			System.out.print(ele + " ");
		}
		
	}

}
