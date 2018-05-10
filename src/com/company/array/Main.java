package com.company.array;

public class Main {

    public static void main(String[] args) {
        //        int[] rndArr = new int[] {4, 5, 2, 1, 3};
        //        PriorityQueue pq = new PriorityQueue(rndArr, true);
        //        pq.sort();
        //
        //        pq = new PriorityQueue(rndArr, false);
        //        pq.sort();
        //
        //        pq = new PriorityQueue(10, false);
        //        for (int i = 1; i <= 10; i++) {
        //            pq.enqueue(i);
        //        }
        //        pq.sort();

        int[] nums = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        LeetCode lc = new LeetCode();
        int res = lc.findKthLargest(nums, 4);
        System.out.println(res);
    }
}
