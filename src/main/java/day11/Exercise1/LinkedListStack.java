package day11.Exercise1;

// LinkedListStack.java
public class LinkedListStack {
    private Node top;  // Reference to the top element of the stack

    // Constructor to initialize the stack
    public LinkedListStack() {
        this.top = null;  // Initially, the stack is empty
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (top == null) {
            top = newNode;  // If the stack is empty, make the new node the top
        } else {
            newNode.next = top;  // Link the new node to the current top
            top = newNode;  // Update the top to the new node
        }
        System.out.println("Pushed " + data + " to the stack.");
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: Stack underflow. Cannot pop from an empty stack.");
            return -1;  // Error code when the stack is empty
        }
        int poppedData = top.data;  // Store the top element's data
        top = top.next;  // Move the top pointer to the next node
        System.out.println("Popped " + poppedData + " from the stack.");
        return poppedData;  // Return the popped data
    }

    // Peek operation: Returns the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: Stack is empty. No top element to peek.");
            return -1;  // Error code when the stack is empty
        }
        return top.data;  // Return the data of the top node
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;  // The stack is empty if top is null
    }

    // Display the entire stack (for debugging purposes)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        System.out.print("Stack (top -> bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
