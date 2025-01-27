package aiseHi;

import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ListNode{
 	public static void main(String[] args) {
 		int n = 3;
 		binary(0, n, "");
 	}

	private static void binary(int i, int n, String s) {
		if(i > 1 && s.charAt(i - 1) == '1' && s.charAt(i - 2) == '1') return;
		if(i == n) { 
			System.out.println(s);
			return;
		}
		binary(i + 1, n, s + "0");
		binary(i + 1, n, s + "1");
	}
}
class Triplet implements Comparable<Triplet>{
	int currIdx; 
	int parentIdx;
	int weight;
	Triplet(int currIdx, int parentIdx, int weight) {
		this.currIdx = currIdx;
		this.parentIdx = parentIdx;
		this.weight = weight;
	}
	public int compareTo(Triplet t) {
		return this.weight - t.weight;
	}
}
class Pair implements Comparable<Pair> {
	int ele;
	int diff;
	Pair(int ele, int diff){
		this.ele = ele;
		this.diff = diff;
	}
	public int compareTo(Pair p) {
		if(this.diff == p.diff) return this.ele - p.ele;
		return this.diff - p.diff;
	}
}
class Solution {
//	METHOD - 1 : RECURSION
	private void helper(int openBracket, int closedBracket, int n, List<String> list, List<String> ans) {
		
	}
    public List<String> generateParenthesis(int n) {
    	List<String> ans = new ArrayList<>();
    	helper(0, 0, n, new ArrayList<>(), ans);
    	return ans;
    }
}