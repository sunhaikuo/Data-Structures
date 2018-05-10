package com.company.array;

public class Array {

    private int size = 0;

    private int[] arr = null;

    Array(int capacity) {
        arr = new int[capacity];
    }

    Array() {
        this(10);
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, int e) {
        if (index < 0) {
            throw new IllegalArgumentException("下标不能为负");
        }
        if (index >= arr.length) {
            throw new IllegalArgumentException("超过数组最大长度");
        }
        if (size == arr.length) {
            throw new IllegalArgumentException("数组已满");
        }
        if (index > size) {
            throw new IllegalArgumentException("插入的位置会导致有空元素");
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = e;
        size++;
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public void addLast(int e) {
        add(size, e);
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

}
