package com.company.array;

public class BinarySearch {
    int[] arr;

    BinarySearch(int[] sortedArr) {
        this.arr = sortedArr;
    }

    public int search(int l, int r, int value) {
        int midIdx = (l + r) / 2;
        int midVal = arr[midIdx];
        if (l > r) {
            return -1;
        }
        if (midVal == value) {
            return midIdx;
        } else if (midVal > value) {
            return this.search(l, midIdx - 1, value);
        } else {
            return this.search(midIdx + 1, r, value);
        }
    }

    public void insert(int[] arr, int value) {}
}
