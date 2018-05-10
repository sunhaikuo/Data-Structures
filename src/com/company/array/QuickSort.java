package com.company.array;

public class QuickSort {

    public void test(int count) {
        //        int[] arr = new int[] {5, 6, 2, 3, 1, 4, 8, 7};
        int[] arr = new int[] {8, 7, 4, 5};
        long start = System.currentTimeMillis();
        quickSort(arr);
        long end = System.currentTimeMillis();
        Util.log(count, start, end, false, "快速排序");
        Util.printArr(arr);
        System.out.println("---------------------");

        //        int[] arr1 = Util.randomNearlyArr(count, 10);
        //        start = System.currentTimeMillis();
        //        quickSort(arr);
        //        end = System.currentTimeMillis();
        //        Util.log(count, start, end, true, "快速排序");
    }

    public void quickSort(int[] arr) {
        _quickSort(arr, 0, arr.length - 1);
    }

    public void _quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int j = _partition2(arr, l, r);
        _quickSort(arr, l, j - 1);
        _quickSort(arr, j + 1, r);
    }

    public int _partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < v) {
                // 交投的j+1位置的元素, 因为j+1的值为>v的第一个值
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
    // 可以解决数组几乎有序的情况下, 递归超出问题
    public int _partition1(int[] arr, int l, int r) {
        Util.printArr(arr);
        // 随机位置, 和第一个位置交换, 可以防止树倾斜问题
        int random = Util.randomInt(l, r);
        int tmpInt = arr[l];
        arr[l] = random;
        arr[random] = tmpInt;
        int v = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
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
    // 双路排序解决大量重复数据问题
    public int _partition2(int[] arr, int l, int r) {
        System.out.println(l + "-" + r);
        Util.printArr(arr);
        int i = l;
        int j = r;
        int v = arr[l];
        //        for (int m = l; m <= r; m++) {
        //            if (i == j) {
        //                System.out.println(i + "break" + j);
        //                break;
        //            }
        //            if (arr[i] < v) {
        //                System.out.println(1 + "||||");
        //                i++;
        //            } else if (arr[j] > v) {
        //                System.out.println(2 + "||||");
        //                j--;
        //            } else {
        //                System.out.println(3 + "||||");
        //                int tmp = arr[i];
        //                arr[i] = arr[j];
        //                arr[j] = tmp;
        //                i++;
        //                j--;
        //                Util.printArr(arr);
        //            }
        //        }

        while (true) {
            while (arr[i] < v) {
                i++;
            }
            while (arr[j] > v) {
                j--;
            }
            if (arr[i] >= v || arr[j] <= v) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
            if (i >= j) {
                break;
            }
        }
        Util.printArr(arr);
        System.out.println(i + "----" + j);
        int tmp = arr[j];
        arr[j] = v;
        arr[l] = tmp;
        Util.printArr(arr);
        System.out.println("------------------------------------------");
        return j;
    }
}
