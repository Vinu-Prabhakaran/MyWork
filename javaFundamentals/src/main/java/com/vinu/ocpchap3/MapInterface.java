package com.vinu.ocpchap3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {

		/*
		void clear() Removes all keys and values from the map.
		boolean isEmpty() Returns whether the map is empty.
		int size() Returns the number of entries (key/value pairs) in the map.
		V get(Object key) Returns the value mapped by key or null if none is mapped.
		V put(K key, V value) Adds or replaces key/value pair. Returns previous value or null.
		V remove(Object key) Removes and returns value mapped to key. Returns null if none.
		boolean	containsKey(Object key) Returns whether key is in map.
		boolean containsValue(Object) Returns value is in map.
		Set<K> keySet() Returns set of all keys.
		Collection<V> values() Returns Collection of all values.
		*/
		
		Map<String,String> hm = new HashMap<>();
		System.out.println(hm.isEmpty());
		System.out.println(hm.put("Koala","Bamboo"));
		System.out.println(hm.put("Lion","Meat"));
		System.out.println(hm.put("Giraffe","Meat"));
		System.out.println(hm.put("Giraffe","Leaf"));	//returns earlier value for the key
		System.out.println(hm);
		System.out.println("Map size is "+hm.size());
		System.out.println(hm.put("Cow","Grass"));
		System.out.println("Koala eats ? "+hm.get("Koala"));
		System.out.println("Does the map contain key Tiger ?"+hm.containsKey("Tiger"));
		System.out.println("Does the map contain value Meat ?"+hm.containsValue("Meat"));
		System.out.println("Now let's print the entire contents from the HashMap");
		for(String key : hm.keySet()) {
			
			System.out.println(key+" eats "+hm.get(key));
		}
		
		System.out.println("Removing Cow "+hm.remove("Cow"));	//returns the value
		System.out.println("values() "+hm.values());
		
		System.out.println("Now let's redo the same for a TreeMap. Here we will see that the key order is maintained");
		
		Map<String,String> tm = new TreeMap<>();
		System.out.println(tm.isEmpty());
		System.out.println(tm.put("Koala","Bamboo"));
		System.out.println(tm.put("Lion","Meat"));
		System.out.println(tm.put("Giraffe","Meat"));
		System.out.println(tm.put("Giraffe","Leaf"));	//returns earlier value for the key
		System.out.println(tm);
		System.out.println("Map size is "+tm.size());

	}

}
