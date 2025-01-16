package aiseHi;

import java.util.Queue;
import java.util.Scanner;
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
class Solution {
    // BRUTE FORCE
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        arr[0] = start;
        int xor = arr[0];
        for (int i = 1; i < n; i++) {
			arr[i] = start + 2 * i;
			xor ^= arr[i];
		}
        return xor;
    }
}