package com.company.queue;

import com.company.util.Util;

import java.util.Arrays;
import java.util.Random;

/** 基于堆实现的优先队列 */
public class PriorityQueue {
    //    数组容量
    private int capacity;
    //    可用元素个数
    private int size = 0;
    //    数组
    private int[] arr;
    //    是否为最大堆/最小堆
    private boolean isMax;

    //    构造一个随机数组 - 是否使用heapify
    public PriorityQueue(int capacity, boolean isHeapify, boolean isMax) {
        this.isMax = isMax;
        this.capacity = capacity;
        this.arr = new int[capacity];
        int[] rndArr = new int[capacity];
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            rndArr[i] = random.nextInt(capacity);
        }
        //        是否使用高效的方式
        if (isHeapify) {
            this.heapify(rndArr);
        } else {
            for (int i = 0; i < capacity; i++) {
                this.enqueue(rndArr[i]);
            }
        }
    }

    //    构造一个空数组
    public PriorityQueue(int capacity, boolean isMax) {
        this.isMax = isMax;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    //    构造一个随机数组 - 使用heapify
    public PriorityQueue(int[] rndArr, boolean isMax) {
        this.isMax = isMax;
        this.capacity = rndArr.length;
        this.heapify(rndArr);
    }

    //    测试heapify和入队操作 来生成完全二叉树，哪个性能更好
    public static void testHeapifyAndEnqueue() {
        int capacity = 30;
        long start = System.currentTimeMillis();
        new PriorityQueue(capacity, false, true);
        long end = System.currentTimeMillis();
        Util.log(capacity, start, end, false, "一般方式生成最大堆");

        start = System.currentTimeMillis();
        new PriorityQueue(capacity, true, true);
        end = System.currentTimeMillis();
        Util.log(capacity, start, end, false, "heapify方式生成最大堆");
    }

    //    出队操作，生成一个有序数组
    public int[] sort() {
        int[] result = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            result[i] = this.dequeue();
        }
        return result;
    }
    //    原地排序 - 节省O(n)空间
    public void sortLocal() {
        while (size > 0) {
            swap(0, size - 1);
            size--;
            shiftDown(0);
        }
    }

    //    入队
    public void enqueue(int e) {
        this.arr[size] = e;
        this.shiftUp(size);
        size++;
    }
    //    出队
    public int dequeue() {
        int top = this.arr[0];
        this.swap(0, size - 1);
        size--;
        this.shiftDown(0);
        return top;
    }

    //    出队后，再新增加一个元素
    public int dequeue(int newVal) {
        int top = arr[0];
        arr[0] = newVal;
        shiftDown(0);
        return top;
    }

    //    获取队列中第一个元素
    public int getFront() {
        return this.arr[0];
    }

    //     heapify方式 - 把无序数组转成最大二叉树
    private void heapify(int[] randomArr) {
        this.arr = randomArr;
        this.size = randomArr.length;
        for (int i = parent(size - 1); i >= 0; i--) {
            this.shiftDown(i);
        }
    }

    private void shiftDown(int index) {
        while (leftChild(index) < size) {
            int j = leftChild(index);
            if (this.isMax) {
                if (j + 1 < size && arr[j] < arr[j + 1]) {
                    j++;
                }
                if (arr[index] >= arr[j]) {
                    break;
                }
            } else {
                if (j + 1 < size && arr[j] > arr[j + 1]) {
                    j++;
                }
                if (arr[index] <= arr[j]) {
                    break;
                }
            }

            swap(index, j);
            index = j;
        }
    }

    private void shiftUp(int index) {
        while (parent(index) >= 0 && this.isMax
                ? arr[parent(index)] < arr[index]
                : arr[parent(index)] > arr[index]) {
            int pIndex = parent(index);
            swap(pIndex, index);
            index = pIndex;
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    private void heapIsCorrect() {
        boolean isError = false;
        for (int i = 0; i < size; i++) {
            int j = leftChild(i);
            if (j < size) {
                if (j + 1 < size && arr[j + 1] > arr[j]) {
                    j++;
                }
                if (arr[i] < arr[j]) {
                    isError = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (isError) {
            System.out.println("ERROR!!!!");
        } else {
            System.out.println("是最大堆！");
        }
    }
}
