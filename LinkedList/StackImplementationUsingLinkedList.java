package LinkedList;

public class StackImplementationUsingLinkedList {

	public static void main(String[] args) {
		StackLinkedList stackLinkedList = new StackLinkedList();
		System.out.println("INSERTING AT FIRST (TOP) IN STACK IMPLEMENTED USING LINKED LIST ");
		stackLinkedList.push(39); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java
		stackLinkedList.push(71); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java
		stackLinkedList.push(11); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java
		stackLinkedList.push(76); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java

		System.out.println("\nDELETING FROM FIRST (TOP) FROM STACK IMPLEMENTED USING LINKED LIST ");

		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java
		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java
		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java
		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING
										// LINKED LIST in java

	}

}

class StackLinkedList {

	LinkedList12 linkedList = new LinkedList12(); // creation of Linked List

	/**
	 * Push items in stack, it will put items on top of Stack.
	 */
	public void push(int value) {
		linkedList.insertFirst(value);
	}

	/**
	 * Pop items in stack, it will remove items from top of Stack.
	 */
	public void pop() throws StackEmptyException {
		try {
			linkedList.deleteFirst();
		} catch (LinkedListEmptyException llee) {
			throw new StackEmptyException();
		}
	}

	/**
	 * Display stack.
	 */
	public void displayStack() {
		System.out.print("Displaying Stack >  Top to Bottom : ");
		linkedList.displayLinkedList();
	}

}

class LinkedList12 {
	private Node first; // ref to first link on list

	/**
	 * LinkedList constructor
	 */
	public LinkedList12() {
		first = null;
	}

	/**
	 * Insert New Node at first position
	 */
	public void insertFirst(int data) {
		Node newNode = new Node(data); // Creation of New Node.
		newNode.next = first; // newLink ---> old first
		first = newNode; // first ---> newNode
	}

	/**
	 * Deletes first Node
	 */
	public Node deleteFirst() {
		if (first == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node tempNode = first; // save reference to first Node in tempNode- so
								// that we could return saved reference.
		first = first.next; // delete first Node (make first point to second
							// node)
		return tempNode; // return tempNode (i.e. deleted Node)
	}

	/**
	 * Display LinkedList
	 */
	public void displayLinkedList() {
		Node tempDisplay = first; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of
										// list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; // move to next Node
		}
		System.out.println();

	}

}


/*INSERTING AT FIRST (TOP) IN STACK IMPLEMENTED USING LINKED LIST 
Displaying Stack >  Top to Bottom : 39 
Displaying Stack >  Top to Bottom : 71 39 
Displaying Stack >  Top to Bottom : 11 71 39 
Displaying Stack >  Top to Bottom : 76 11 71 39 

DELETING FROM FIRST (TOP) FROM STACK IMPLEMENTED USING LINKED LIST 
Displaying Stack >  Top to Bottom : 11 71 39 
Displaying Stack >  Top to Bottom : 71 39 
Displaying Stack >  Top to Bottom : 39 
Displaying Stack >  Top to Bottom : */