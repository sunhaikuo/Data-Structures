package com.company.stack;

public class Stack<E> implements IStack<E> {

    private int capacity;

    private int size;

    private E[] items;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.items = (E[]) new Object[capacity];
    }

    @Override
    public void push(E e) {
        if (size > capacity) {
            throw new IllegalArgumentException("超出最大长度");
        }
        items[size] = e;
        size++;
    }

    @Override
    public E pop() {
        if (size == 0) {
            throw new IllegalArgumentException("栈为空");
        }
        E last = items[size - 1];
        size--;
        return last;
    }

    @Override
    public E peek() {
        return size == 0 ? null : items[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(items[i] + ", ");
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("] Top");
        return sb.toString();
    }
}
