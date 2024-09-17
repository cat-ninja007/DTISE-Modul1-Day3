package day11.Exercise1;

// Node.java
public class Node {
    int data;  // The data stored in the node
    Node next; // Reference to the next node in the stack

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
