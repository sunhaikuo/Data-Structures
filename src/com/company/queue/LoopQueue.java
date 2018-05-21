package com.company.queue;

// 循环队列中的循环队列
// TODO 完善循环队列
public class LoopQueue implements IQueue<Integer> {
    private int capacity;
    private int tail = 0;
    private int front = 0;
    private int[] arr;

    public LoopQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    @Override
    public void enqueue(Integer val) {
        if (isFull()) {
            throw new IllegalArgumentException("队列已满！");
        }

        if (tail == arr.length - 1) {
            tail = 0;
            arr[tail] = val;
            tail++;
        } else {
            arr[tail] = val;
            tail++;
        }
    }

    @Override
    public Integer dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空！");
        }
        int res = arr[front];
        if (tail > front) {
            front++;
        } else {
            if (front == arr.length - 1 && tail == 0) {
                front = 0;
                tail = 1;
            } else {
                front++;
                front = front % arr.length;
            }
        }
        return res;
    }

    @Override
    public Integer getFront() {
        return arr[tail - 1];
    }

    @Override
    public int size() {
        if (isFull()) {
            return front;
        }
        if (isEmpty()) {
            return 0;
        }
        if (tail > front) {
            return tail - front + 1;
        }
        if (tail < front) {}
        return tail - front;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public boolean isFull() {
        if (front == 0 && tail == arr.length - 1) {
            return true;
        } else if (front - tail == 2) {
            return true;
        }
        return false;
    }
}
