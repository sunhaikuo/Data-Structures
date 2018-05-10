package com.company.array;

import com.company.Queue.PriorityQueue;

public class LeetCode {

    //    215. 数组中的第K个最大元素
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue pq = new PriorityQueue(k, false);
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (i < k) {
                pq.enqueue(val);
            } else if (val > pq.getFront()) {
                pq.dequeue();
                pq.enqueue(val);
            }
        }
        return pq.dequeue();
    }
}
