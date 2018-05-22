package com.company.stack;

import com.company.Link.LinkedList_0522;

/**
 * 使用链接来实现栈
 *
 * @param <E>
 */
public class StackWithLinkedList<E> implements IStack<E> {
    private LinkedList_0522<E> list;

    StackWithLinkedList() {
        this.list = new LinkedList_0522();
    }

    @Override
    public void push(E e) {
        list.addLast(e);
    }

    @Override
    public E pop() {
        return list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
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
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + ", ");
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("] Top");
        return sb.toString();
    }
}
