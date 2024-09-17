package day11.Exercise1;

// DynamicStackDemo.java
public class DynamicStackDemo {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Test stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  // Stack: 30 20 10

        System.out.println("Peek: " + stack.peek());  // Output: 30

        stack.pop();  // Output: Popped 30
        stack.display();  // Stack: 20 10

        stack.pop();  // Output: Popped 20
        stack.pop();  // Output: Popped 10

        // Edge case: Pop from an empty stack
        stack.pop();  // Output: Error message for stack underflow
    }
}
