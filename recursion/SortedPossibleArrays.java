package recursion;

// Pending
import java.util.ArrayList;

public class SortedPossibleArrays {

//	Given two sorted arrays A and B, generate all possible arrays such that the first element is taken from A
//	then from B then from A, and so on in increasing order till the arrays are exhausted. The generated arrays
//	should end with an element from B.
	
	public static void newArray(int i, int[]a, int[] b) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(a[i]);
		int j = 0, k = b.length - 1, mid = (j + k) / 2, find = -1;
		while(j <= k) {
			if(b[mid] <= a[i]) j = mid + 1;
			else {
				k = mid - 1;
				find = b[k];
			}
		}
		arr.add(find);
		newArray(i + 1, a, b);
	}
	
	public static void main(String[] args) {
		int[] a = {10, 15, 20};
		int[] b = {1, 5, 20, 30};
		
		newArray(0, a, b);
	}

}
