package hashsetsAndHashmaps;

import java.util.TreeMap;

public class TreeMapBasics {
//	insert / remove / search : TC - O(logn)

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Satyam", 57); 
		map.put("Raghav", 62);
		map.put("Saleem", 52);
		map.put("Prachi", 42);
		map.put("ayushi", 48);
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key)); //print on the basis of
//			sorting 'keys', compare on the basis of ascii values
		}

	}

}
