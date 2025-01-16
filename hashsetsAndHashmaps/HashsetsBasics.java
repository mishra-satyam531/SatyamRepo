package hashsetsAndHashmaps;

import java.util.HashSet;

public class HashsetsBasics {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
//		add - TC : O(1);
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set); // doesn't print in order : TC O(n);
		System.out.println("Size is : " + set.size());
//		search - true/false - TC : O(1)
		System.out.println(set.contains(30));
		set.remove(20); //TC : O(1)
		System.out.println(set);
		set.remove(0);//no erro reven element is not present
		
//		CONVERT TO ARRAY
		Object[] arr = set.toArray();
		for(Object ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
