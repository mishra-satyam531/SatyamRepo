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
	int row; 
	int col;
	Pair(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
class Solution{
    // DFS
	private void dfs(int i, int j, char[][] grid, boolean[][] isVisited) {
		int m = grid.length, n = grid[0].length;
		isVisited[i][j] = true;
		if(i-1 >= 0 && !isVisited[i-1][j] && grid[i-1][j] == '1')
            dfs(i-1, j, grid, isVisited);
		if(i+1 < m && !isVisited[i+1][j] && grid[i+1][j] == '1')
            dfs(i+1, j, grid, isVisited);
		if(j-1 >= 0 && !isVisited[i][j-1] && grid[i][j-1] == '1')
            dfs(i, j-1, grid, isVisited);
		if(j+1 < n && !isVisited[i][j+1] && grid[i][j+1] == '1')
            dfs(i, j+1, grid, isVisited);
	}
    public int numIslands(char[][] grid) {
    	int m = grid.length, n = grid[0].length, numOfIslands = 0;
        boolean[][] isVisited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1' && !isVisited[i][j]) 
                    dfs(i, j, grid, isVisited);
				numOfIslands++;
			}
		}
        return numOfIslands;
    }
}