package com.company.Link;

/**
 * 2018年5月22日实现
 *
 * @param <E>
 */
public class LinkedList_0522<E> implements ILinkedList<E> {

    private class Node {
        private Node next;
        private E e;

        public Node() {
            this.e = null;
            this.next = null;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node(Node next, E e) {
            this.next = next;
            this.e = e;
        }
    }

    private int size;
    private Node dummyHead;

    public LinkedList_0522() {
        this.size = 0;
        this.dummyHead = new Node();
    }

    @Override
    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("参数错误");
        }

        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node node = new Node(e);
        node.next = pre.next;
        pre.next = node;
        size++;
    }

    @Override
    public void addFirst(E e) {
        this.add(0, e);
    }

    @Override
    public void addLast(E e) {
        this.add(size, e);
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("参数错误");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    @Override
    public E getFirst() {
        return get(0);
    }

    @Override
    public E getLast() {
        return get(size - 1);
    }

    @Override
    public void set(int index, E e) {
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    @Override
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur.next != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node cur = pre.next;
        E res = cur.e;
        pre.next = cur.next;
        cur.next = null;
        size--;
        return res;
    }

    @Override
    public E removeFirst() {
        return remove(0);
    }

    @Override
    public E removeLast() {
        return remove(size - 1);
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
        StringBuilder res = new StringBuilder();
        res.append("[");
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur.e).append("-->");
            cur = cur.next;
        }
        res.append("NULL]");
        return res.toString();
    }
}
