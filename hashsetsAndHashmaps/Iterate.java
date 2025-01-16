package hashsetsAndHashmaps;

import java.util.HashSet;

public class Iterate {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
//		can't iterate with for/while loop as there is no concept of indexing
//		will go for for-each loop
		set.add(10);
		set.add(30);
		set.add(0);
		set.add(-8);
		set.add(10);
		for(int ele : set) {
			System.out.print(ele + " "); //print only one of duplicate elements
		}
		System.out.println();
		set.clear();
		for(int ele : set) {
			System.out.print(ele + " "); 
		}
	}

}
