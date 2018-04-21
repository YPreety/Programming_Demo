package LinkedList;

/*Displaying LinkedList [first--->last]: 11 22 33 44 55 66 
LinkedList is NOT CIRCULAR

LinkedList has been succesfully converted into CircularLinkedList
Displaying LinkedList [first--->last]: 11 22 33 44 55 66 33 44 55 66 33 44 
LinkedList is CIRCULAR*/

public class SinglyLinkedListCircularOrNot {

	public static void main(String[] args) {
		 LinkedList7 linkedList=new LinkedList7();
         linkedList.insert(66);
         linkedList.insert(55);
         linkedList.insert(44);
         linkedList.insert(33);
         linkedList.insert(22);
         linkedList.insert(11);
         
         linkedList.displayLinkedList();
         linkedList.findCircularOrNot();
         
         System.out.println();
         linkedList.makeLinkedListCircular();
         linkedList.displayLinkedList();
         linkedList.findCircularOrNot();

	}

}
class LinkedList7{
    
    Node first=null;
    Node circularPoint1; //points used to make LinkedList circular.
    Node circularPoint2;
    
    Node slowPointer; //will step over LinkedList by 1 Node.
    Node fastPointer; //will step over LinkedList by 2 Node.
 
    
    /**
     * Insert New Node at first position
     */
    public void insert(int data){
           
           Node newNode=new Node(data);
           newNode.next=first;
           first=newNode;
           
           /*
            * Below we have kept track of two Nodes so that later we can make LinkedList circular(If required).
            * Note:- I have kept track of below two nodes just for demonstration purpose. You may provide some other implementation for making LinkedList circular.
            */
           if(data==33)
                  circularPoint1=newNode;        
           if(data==66)
                  circularPoint2=newNode;
           
    }
    
    /**
     *This method makes LikedList circular- by making end Node point to some middle Node of LinkedList.
     *end Node--->middle Node.
     */
    public void makeLinkedListCircular(){
           circularPoint2.next=circularPoint1;
           System.out.println("LinkedList has been succesfully converted into CircularLinkedList");
    }
    
    /**
     * method finds out whether LinkedList is circular or not?
     */
    public void findCircularOrNot(){
           slowPointer=first;
           fastPointer=first;
           
           while( (slowPointer!=fastPointer || slowPointer==first) //when first time condition is checked    slowPointer is equal to fastPointer -so that does not means LinkedList is circular and we exit while loop
                                                                                      //we got to be cautious by keeping extra check that whether we are on first node or not.
                        && fastPointer.next!=null  //used to avoid NullPointerException(in case we are are on last Node- than next is null, calling further next on null will cause NPE.)
                        && fastPointer.next.next!=null){
                  slowPointer=slowPointer.next;         // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.next.next; // step over LinkedList by 2 Node.    
           }
           
           if(slowPointer==fastPointer)
                  System.out.println("LinkedList is CIRCULAR");
           else
                  System.out.println("LinkedList is NOT CIRCULAR");
           
    }
    
 
    /**
     * Display LinkedList
     */
    public void displayLinkedList(){
           Node tempDisplay=first;        
           int displayLimiterCtr=0;   //as our LinkedList is circular it will keep on displaying nodes till infinity...
                                                           //so this variable will help us in limiting the display to specific count.
           System.out.print("Displaying LinkedList [first--->last]: ");
           while(tempDisplay!=null){
                  tempDisplay.displayNode();
                  tempDisplay=tempDisplay.next;
                  if(++displayLimiterCtr >= 12)         //stops displaying after 12 Nodes.
                        break;
           }
           System.out.println();
    }
    
}