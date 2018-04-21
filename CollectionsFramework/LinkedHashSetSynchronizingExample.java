package CollectionsFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet - synchronizing using Collections.synchronizedSet program in java
public class LinkedHashSetSynchronizingExample {

	public static void main(String[] args) {
		Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

		linkedLinkedHashSet.add("ankit");
		linkedLinkedHashSet.add("javaMadeSoEasy");

		// getting synchronized LinkedHashSet
		Set<String> synchronizedSet = Collections.synchronizedSet(linkedLinkedHashSet);

		// Iterator on synchronizedSet won't be synchronized, so will have to
		// synchronize set using synchronization block during iteration
		System.out.println("------- iterating on synchronized set -------");
		synchronized (synchronizedSet) {
			Iterator<String> iterator = synchronizedSet.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

	}

}

/*
 * output
 * 
 * ------- iterating on synchronized set ------- ankit javaMadeSoEasy
 * 
 */