package hashsetsAndHashmaps;

import java.util.HashMap;

public class HashMapBasics {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Satyam", 57); //TC : O(1)
		map.put("Raghav", 62);
		map.put("Saleem", 52);
		map.put("Prachi", 45);
		map.put("Ayushi", 43);
		System.out.println(map + " " + map.size());//random order 	
		System.out.println(map.containsKey("Satyam"));
		System.out.println(map.containsValue(44));
		
		map.put("Satyam", 100); //will change Satyam's value as keys can't be duplicate
		System.out.println(map + " " + map.size());
		
		map.put("Harish", 52);
		System.out.println(map + " " + map.size());//duplicate values can exist
		
		map.remove("Raghav");// removes pair
		System.out.println(map + " " + map.size());
		map.remove("Gagan");
		System.out.println(map + " " + map.size());//doesn't throw error when element isn't present
		
		System.out.println(map.get("Ayushi"));//gives value for the key, give null when not present
	}

}
