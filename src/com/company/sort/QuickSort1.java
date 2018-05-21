package com.company.sort;

import com.company.util.Util;

public class QuickSort1 {

    public void sort() {
        int[] arr = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        this._sort(arr, 0, arr.length - 1);
        Util.printArr(arr);
    }

    private void _sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = partition(arr, l, r);
        _sort(arr, l, mid);
        _sort(arr, mid + 1, r);
    }

    public int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        for (int i = l; i <= r; i++) {
            if (arr[i] < v) {
                int tmp = arr[i];
                arr[i] = arr[j + 1];
                arr[j + 1] = tmp;
                j++;
            }
        }
        arr[l] = arr[j];
        arr[j] = v;
        return j;
    }
}
