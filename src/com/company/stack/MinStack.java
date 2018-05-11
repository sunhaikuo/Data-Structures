package com.company.stack;

public class MinStack {

    private int[] nums;

    private int capacity;

    private int size;

    private int minIndex = 0;

    /** initialize your data structure here. */
    public MinStack() {
        this.capacity = 10;
        this.size = 0;
        this.nums = new int[this.capacity];
    }

    public void push(int x) {
        if (size == capacity) {
            this.capacity *= 2;
            int[] nNums = new int[this.capacity];
            for (int i = 0; i < nums.length; i++) {
                nNums[i] = nums[i];
            }
            this.nums = nNums;
        }
        this.nums[size] = x;
        if (x < nums[minIndex]) {
            minIndex = size;
        }
        size++;
    }

    public void pop() {
        if (size > 0) {
            size--;
            if (minIndex == size) {
                int newMinIndex = 0;
                for (int i = 0; i < size; i++) {
                    if (nums[i] < nums[newMinIndex]) {
                        newMinIndex = i;
                    }
                }
                minIndex = newMinIndex;
            }
        }
    }

    public int top() {
        if (size - 1 < 0) {
            throw new IllegalArgumentException("数组为空");
        }
        return this.nums[size - 1];
    }

    public int getMin() {
        return nums[minIndex];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(nums[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("] Top");
        return sb.toString();
    }
}
