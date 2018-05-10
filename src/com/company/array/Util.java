package com.company.array;

import java.util.Random;

public class Util {

    public static int[] randomArr(int count) {
        int[] arr = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt(count) + 1;
        }
        return arr;
    }

    public static int[] randomNearlyArr(int count, int nCount) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < nCount; i++) {
            int j = i * 5;
            int tmp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static int randomInt(int start, int end) {
        Double d = (end - start) * Math.random() + start;
        return d.intValue();
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void log(int count, long start, long end, boolean sorted, String type) {
        String countStr;
        if (count > 100 * 100) {
            countStr = count / (100 * 100) + "万";
        } else {
            countStr = count + "";
        }
        System.out.println(
                (sorted ? "有" : "无")
                        + "序数组 "
                        + countStr
                        + " 个元素使用"
                        + type
                        + "时间:"
                        + (end - start)
                        + "毫秒");
    }

    public static Double log2(int value) {
        Double result = Math.log(value) / Math.log(2);
        return result;
    }
}
