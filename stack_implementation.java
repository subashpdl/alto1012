import java.util.EmptyStackException;

interface Stack {
    Object push(Object item);
    Object pop();
    Object peek();
    int size();
}

class SimpleStack implements Stack {
    private Node top;
    private int count;

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public SimpleStack() {
        this.top = null;
        this.count = 0;
    }

    @Override
    public Object push(Object item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        count++;
        return item;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object data = top.data;
        top = top.next;
        count--;
        return data;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    @Override
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack stack = new SimpleStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Stack size after pops: " + stack.size());
    }
}
