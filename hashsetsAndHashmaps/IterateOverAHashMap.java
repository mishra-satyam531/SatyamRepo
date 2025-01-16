package hashsetsAndHashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class IterateOverAHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Satyam", 57); //TC : O(1)
		map.put("Raghav", 62);
		map.put("Saleem", 52);
		map.put("Prachi", 45);
		map.put("Ayushi", 43);
		map.put("Harish", 52);
		
		for(String key : map.keySet()) { //key is just a variable
			System.out.println(key + " " + map.get(key)	);
		}
		System.out.println();
		
		for(int val : map.values()) { //value is just a variable
			System.out.println(val);
		}
		System.out.println();
		
		for(Object pair : map.entrySet()) { //pair is just a variable
			System.out.println(pair);
		}	
	}
}
