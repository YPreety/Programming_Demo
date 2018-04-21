package CollectionsFramework;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet - making set unmodifiable using Collections.unmodifiableSet
public class LinkedHashSetUnmodifiableExample {

	public static void main(String[] args) {
		// creates array with initial capacity of 10.
		Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();

		linkedLinkedHashSet.add("ankit");
		linkedLinkedHashSet.add("javaMadeSoEasy");

		// getting unmodifiable LinkedHashSet
		Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedLinkedHashSet);

		/*
		 * Now any attempt to modify list will throw
		 * java.lang.UnsupportedOperationException
		 */
		unmodifiableSet.add("mittal");

	}

}
/*
 * OUTPUT
 * 
 * Exception in thread "main" java.lang.UnsupportedOperationException at
 * java.util.Collections$UnmodifiableCollection.add(Unknown Source) at
 * LinkedHashSetUnmodifiableExample.main(LinkedHashSetUnmodifiableExample.java:
 * 24)
 * 
 */