package com.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleStack<T> implements Stack<T> {
    private List<T> stackList;

    public SimpleStack() {
        stackList = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        stackList.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stackList.remove(stackList.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stackList.get(stackList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    @Override
    public int size() {
        return stackList.size();
    }
}