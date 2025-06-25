public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;

    /** Basic constructor */
    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    } // method toString

    /** Add a new node to the linked list */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail); // This connects new node back to old tail 
        }
        this.tail = node;
    } // method add

    // overload method add to add a node by value
    /** 
     * Adds a node to list using a string value
     * Method creates a node from the string and assigns it to add(Node)
    */
    public void add(String value) {
        Node node = new Node(value); 
        this.add(node); 
    } // method add

    /** 
     * This reports the number of node in the list by 
     * traveling from head to tail. 
     */
    public int size() { 
        int count = 0; 
        Node cursor = this.head; 
        while (cursor != null) { 
            count++; 
            cursor = cursor.getNext(); 
        }
        return count; 
    } // method size 

    /**
     * Returns the position of the node with the given value. 
     * Uses a while loop with a single return statement 
     */
    public int indexOf(String value) { 
        int index = 0; 
        Node cursor = this.head; 
        boolean found = false; 
        while (cursor != null && !found) { 
            found = value.equals(cursor.getValue()); 
            if (!found) { 
                cursor = cursor.getNext(); 
                index++; 
            }
        }
        return found ? index : -1; 
    }

    /**
     * Checks whether the list contains a node with the given string value 
     * Uses indexOf to avoid duoplicates 
     */
    public boolean contains(String value) { 
        return this.indexOf(value) > -1; 
    } // method contains 

    // implement the comparable interface
    public int compareTo(DoubleLinkedList other) {
        return this.size() - other.size(); 
    } // method compareTo
} // class DoubleLinkedList
