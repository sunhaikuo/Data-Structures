package com.company.queue;

import com.company.Link.LinkedList_0522;

public class LinkedListQueue<E> implements IQueue<E> {

    LinkedList_0522<E> list;

    public LinkedListQueue() {
        this.list = new LinkedList_0522<>();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E getFront() {
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
