package hashsetsAndHashmaps;

import java.util.TreeSet;

public class TreeSetBasics {
//	insert / remove / search : TC - O(logn)
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(20);
		set.add(80);
		set.add(0);
		set.add(-20);
		set.add(10);
		for(int ele : set) {
			System.out.print(ele + " "); //print in sorted order
		}
		System.out.println();
	}

}
