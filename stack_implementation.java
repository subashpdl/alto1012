
import java.util.NoSuchElementException;

class Stack {
    protected int arr[];
    protected int size;
    protected int top;

    public Stack(int n) {
        size = n;
        arr = new int[n];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void Push(int x) {
        if (top >= size - 1) {
            throw new IndexOutOfBoundsException("Overflow Exception");
        }
        top++;
        arr[top] = x;
    }

    void Pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        } else {
            top--;
        }
    }

    int Top() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        } else
            return arr[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.print("Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }

}

public class Reverse {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.Push(4);
        s.Push(6);
        s.Push(5);
        s.Push(8);
        s.Push(9);
        s.Pop();
        s.display();

    }

}