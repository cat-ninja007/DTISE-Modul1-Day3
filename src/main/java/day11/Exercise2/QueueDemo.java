package day11.Exercise2;

// QueueDemo.java
public class QueueDemo {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        // Test queue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // Queue: 10 20 30

        System.out.println("Peek: " + queue.peek());  // Output: 10

        queue.dequeue();  // Output: Dequeued 10
        queue.display();  // Queue: 20 30

        queue.dequeue();  // Output: Dequeued 20
        queue.dequeue();  // Output: Dequeued 30

        // Edge case: Dequeue from an empty queue
        queue.dequeue();  // Output: Error message for queue underflow
    }
}

