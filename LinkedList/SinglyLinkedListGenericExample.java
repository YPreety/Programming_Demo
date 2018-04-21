package LinkedList;

/*Displaying LinkedList [first--->last]: Employee [id=39, name=pat]    Employee [id=14, name=sai]    Employee [id=59, name=katy]    
		Employee [id=21, name=amy]    Employee [id=11, name=sam]    
Deleted Nodes: Employee [id=39, name=pat]    Employee [id=14, name=sai]    
Displaying LinkedList [first--->last]: Employee [id=59, name=katy]    Employee [id=21, name=amy]    Employee [id=11, name=sam] */
		
public class SinglyLinkedListGenericExample {

	public static void main(String[] args) {
		 LinkedList11<Employee11> linkedList = new LinkedList11<Employee11>(); // creation of Linked List
         
         linkedList.insertFirst(new Employee11("11", "sam"));
         linkedList.insertFirst(new Employee11("21", "amy"));
         linkedList.insertFirst(new Employee11("59", "katy"));
         linkedList.insertFirst(new Employee11("14", "sai"));
         linkedList.insertFirst(new Employee11("39", "pat"));

         linkedList.displayLinkedList(); // display LinkedList
                      
         System.out.print("Deleted Nodes: ");
         Node11<Employee11> deletedNode = linkedList.deleteFirst(); //delete Node
         deletedNode.displayNode();                                 //display deleted Node.
         deletedNode = linkedList.deleteFirst();      //delete Node.
         deletedNode.displayNode();                                 //display deleted Node.
         
         System.out.println();// sysout used to format output
         linkedList.displayLinkedList(); //Again display LinkedList

	}

}
class LinkedList11<T> {
    private Node11<T> first; // ref to first link on list
 
    /**
     * LinkedList constructor
     */
    public LinkedList11(){
           first = null;
    }
 
    /**
     * Insert New Node at first position
     */
    public void insertFirst(T data) {
           Node11<T> newNode = new Node11<T>(data);  //Creation of New Node.
           newNode.next = first;   //newLink ---> old first
           first = newNode;  //first ---> newNode
    }
 
    /**
     * Deletes first Node
     */
    public Node11<T> deleteFirst()
    {
           if(first==null){  //means LinkedList in empty, throw exception.              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }
           Node11<T> tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           first = first.next; // delete first Node (make first point to second node)
           return tempNode; // return tempNode (i.e. deleted Node)
    }
    
           
    /**
     * Display LinkedList
     */
    public void displayLinkedList() {
           System.out.print("Displaying LinkedList [first--->last]: ");
           Node11<T> tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}

class Node11<T> {
    public T data; // data in Node.
    public Node11<T> next; // points to next Node in list.
 
    /**
     * Constructor
     */
    public Node11(T data){
           this.data = data;
    }
 
    /**
     * Display Node's data
     */
    public void displayNode() {
           System.out.print( data + " ");
    }
}

class Employee11 {
    private String id;
    private String name;
    
    /**
     * Employee constructor
     */
    public Employee11(String id, String name) { // constructor
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + "]   ";
    }
    
}