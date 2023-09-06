public interface Stack {
    Object push(Object item);
    Object pop();
    Object peek();
    int size();
}

public class SimpleStack implements Stack {
    private int maxSize;
    private int top;
    private Object[] stackArray;

    public SimpleStack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    @Override
    public Object push(Object item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push.");
        } else {
            stackArray[++top] = item;
            return item;
        }
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        } else {
            Object poppedItem = stackArray[top];
            stackArray[top--] = null; // Remove the reference
            return poppedItem;
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        } else {
            return stackArray[top];
        }
    }

    @Override
    public int size() {
        return top + 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }
}
