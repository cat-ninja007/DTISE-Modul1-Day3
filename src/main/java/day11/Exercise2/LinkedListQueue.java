package day11.Exercise2;


public class LinkedListQueue {
    private Node front, rear;  // References to the front and rear of the queue

    // Constructor to initialize the queue
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    // Enqueue operation: Adds an element to the end of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (rear == null) {  // If the queue is empty
            front = rear = newNode;  // Both front and rear point to the new node
        } else {
            rear.next = newNode;  // Link the new node to the last node
            rear = newNode;       // Update the rear pointer to the new node
        }
        System.out.println("Enqueued " + data + " to the queue.");
    }

    // Dequeue operation: Removes and returns the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Error: Queue underflow. Cannot dequeue from an empty queue.");
            return -1;  // Error code for empty queue
        }
        int dequeuedData = front.data;  // Store the data of the front node
        front = front.next;             // Move the front pointer to the next node

        if (front == null) {  // If the queue becomes empty after dequeue
            rear = null;  // Set rear to null as well
        }

        System.out.println("Dequeued " + dequeuedData + " from the queue.");
        return dequeuedData;  // Return the dequeued data
    }

    // Peek operation: Returns the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: Queue is empty. No element to peek.");
            return -1;  // Error code for empty queue
        }
        return front.data;  // Return the data of the front node
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;  // The queue is empty if front is null
    }

    // Display the entire queue (for debugging purposes)
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;
        System.out.print("Queue (front -> rear): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
