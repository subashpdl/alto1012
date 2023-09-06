public class SimpleStack {
    private int maxSize;         // Maximum size of the stack
    private int top;             // Index of the top element
    private int[] stackArray;    // Array to store stack elements

    // Constructor to initialize the stack with a specified size
    public SimpleStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initialize top as -1 to indicate an empty stack
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value for an empty stack
        } else {
            return stackArray[top--];
        }
    }

    // Peek at the top element without removing it from the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value for an empty stack
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get the number of elements in the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        // Create a stack with a maximum size of 5
        SimpleStack stack = new SimpleStack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop and print elements
        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Popped element: " + stack.pop()); // Should print 20

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Should print 10

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Should print false

        // Get the number of elements in the stack
        System.out.println("Number of elements in the stack: " + stack.size()); // Should print 1
    }
}
