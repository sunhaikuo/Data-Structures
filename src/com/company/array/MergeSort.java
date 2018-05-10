package com.company.array;

/* TODO 解决数组完全有序的情况报错问题 */
/* TODO 为什么快速排序要比归并排序要快? */
/* TODO 归并排序的边界问题 */
public class MergeSort {

    public void testInsertionSort(int count) {
        //        long start = 0;
        //        long end = 0;
        //        int[] arr = this.randomArr(count);
        //        start = System.currentTimeMillis();
        //        this.insertionSort(arr);
        //        end = System.currentTimeMillis();
        //        System.out.println("无序数组 " + count / 10000 + "万 个元素使用插入排序时间:" + (end - start) +
        // "毫秒");
        //
        //        arr = this.randomArr(count);
        //        start = System.currentTimeMillis();
        //        this.insertionSort(arr);
        //        end = System.currentTimeMillis();
        //        System.out.println("有序数组 " + count / 10000 + "万 个元素使用插入排序时间:" + (end - start) +
        // "毫秒");
    }

    private void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                }
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
    }

    // 测试归并排序
    public void testMergeSort(int count) {
        //        int[] arr = randomArr(count);
        //        //        int[] nearlyArr = randomNearlyArr(count, 20);
        //        long start;
        //        long end;
        //        start = System.currentTimeMillis();
        //        mergeSort(arr);
        //        end = System.currentTimeMillis();
        //        System.out.println("无序数组 " + count / 10000 + "万 个元素使用归并排序时间:" + (end - start) +
        // "毫秒");
        //
        //        start = System.currentTimeMillis();
        //        mergeSort(nearlyArr);
        //        end = System.currentTimeMillis();
        //        System.out.println("有序数组 " + count / 10000 + "万 个元素使用归并排序时间:" + (end - start) +
        // "毫秒");

        //        start = System.currentTimeMillis();
        //        downToUpMergeSort(arr);
        //        end = System.currentTimeMillis();
        //        System.out.println("无序数组 " + count / 10000 + "万 个元素使用归并排序(自底向上)时间:" + (end -
        // start) + "毫秒");

        //        start = System.currentTimeMillis();
        //        downToUpMergeSort(nearlyArr);
        //        end = System.currentTimeMillis();
        //        System.out.println("有序数组 " + count / 10000 + "万 个元素使用归并排序(自底向上)时间:" + (end -
        // start) + "毫秒");

    }

    private void downToUpMergeSort(int[] arr) {
        int n = arr.length;
        for (int sz = 1; sz <= n; sz += sz) {
            for (int i = 0; i + sz < n; i += sz * 2) {
                int r = Math.min((i + sz * 2 - 1), n - 1);
                optimizationSort(arr, i, (i + sz - 1), r);
            }
        }
    }

    private void mergeSort(int[] arr) {
        _mergeSort(arr, 0, arr.length - 1);
    }

    private void _mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        _mergeSort(arr, l, m);
        _mergeSort(arr, m + 1, r);
        optimizationSort(arr, l, m, r);
    }

    // 优化后的归并
    private void optimizationSort(int[] arr, int l, int m, int r) {
        if (arr[m + 1] > arr[m]) {
            return;
        }
        int[] aux = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            aux[i - l] = arr[i];
        }
        int i = l;
        int j = m + 1;
        for (int k = l; k <= r; k++) {
            if (i > m) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] > aux[j - l]) {
                arr[k] = aux[j - l];
                j++;
            } else {
                arr[k] = aux[i - l];
                i++;
            }
        }
    }
}
