package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinumumProductSubset {
	public static int minProd(int[] arr) {
		int prod = 1;
		int countZero = 0, countNeg = 0;
		int posMin = Integer.MAX_VALUE, negMax = Integer.MIN_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int ele = arr[i];
			if(ele < 0) {
				prod *= ele;
				countNeg++;
				negMax = Math.max(negMax, ele);
			}
			else if(ele == 0) countZero++;	
			else posMin = Math.min(posMin, ele);
		}
		if(countZero > 0 && countNeg == 0) return 0;
		if(countNeg == 0) return posMin;
		if(countNeg != 0 && countNeg %2 == 0) return prod/negMax;
		return prod;
	}
	public static void main(String[] args) {
		int[] arr = {10,0,0};
		System.out.println(minProd(arr));
	}
}
class Pair implements Comparable<Pair>{
	int start;
	int end;
	Pair(int start, int end){
		this.start = start;
		this.end = end;
	}
	public int compareTo(Pair p) {
		if(this.start == p.start) return this.end - p.end;
		return this.start - p.end;
	}
}
class Solution {
	private int binarySearch(int tar, List<Integer> ans) {
		int left = 0, right = ans.size()-1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(ans.get(mid) == tar) return mid;
			else if(ans.get(mid) > tar) right = mid -1 ;
			else left = mid + 1;
		}
		return left;
	}
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        	int left = pairs[i][0];
        	int right = pairs[i][1];
			if(ans.size() == 0 || left > ans.get(ans.size())-1) ans.add(right);
			else {
				int idx = binarySearch(right, ans);
				ans.set(idx, right);
			}
		}
        return ans.size();
    }
}