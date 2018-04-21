package CollectionsFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

//ConcurrentSkipListMap program to use put, get, containsKey , containsValue, remove, size methods in java
public class ConcurrentSkipListMapExample {

	public static void main(String[] args) {
		System.out.println("-----1. create Map---");
		Map<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<Integer, String>();

		System.out.println("\n-----2. put key-value pair in Map ---");
		concurrentSkipListMap.put(11, "ankit");
		concurrentSkipListMap.put(21, "mittal");
		concurrentSkipListMap.put(31, "javaMadeSoEasy");

		System.out.println("\n-----3. get method returns value corresponding to key ---");
		System.out.println("concurrentSkipListMap.get(11) : " + concurrentSkipListMap.get(11));

		System.out.println(
				"\n-----4. containsKey method returns true if map " + "contains a mapping for the specified key ---");
		System.out.println("concurrentSkipListMap.containsKey(11) : " + concurrentSkipListMap.containsKey(11));

		System.out.println("\n-----5. containsValue method returns true if map maps one "
				+ "or more keys to the specified value. ---");
		System.out.println(
				"concurrentSkipListMap.containsValue(\"ankit\") : " + concurrentSkipListMap.containsValue("ankit"));

		System.out.println("concurrentSkipListMap.remove(11) : " + concurrentSkipListMap.remove(11));

		System.out.println("\n-----6. size ---");

		System.out.println("concurrentSkipListMap.size() : " + concurrentSkipListMap.size());

	}

}

/*OUTPUT

-----1. create Map---
 
-----2. put key-value pair in Map ---
 
-----3. get method returns value corresponding to key ---
concurrentSkipListMap.get(11) : ankit
 
-----4. containsKey method returns true if map contains a mapping for the specified key ---
concurrentSkipListMap.containsKey(11) : true
 
-----5. containsValue method returns true if map maps one or more keys to the specified value. ---
concurrentSkipListMap.containsValue("ankit") : true
concurrentSkipListMap.remove(11) : ankit
 
-----6. size ---
concurrentSkipListMap.size() : 2
 
 
*/