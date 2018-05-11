package com.company;

import com.company.stack.MinStack;

import java.util.Random;

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

        //        Stack stack = new Stack(10);
        //        for (int i = 0; i < 10; i++) {
        //            stack.push(i);
        //        }
        //        System.out.println(stack);
        //        stack.pop();
        //        System.out.println(stack);
        //
        //        System.out.println(stack.isEmpty());

        //        int[] nums = new int[] {0, 0};
        //        int length = nums.length;
        //        int j = 0;
        //        for (int i = 1; i < length; i++) {
        //            if (nums[i] != nums[i - 1]) {
        //                j++;
        //                nums[j] = nums[i];
        //            }
        //        }
        //        System.out.println(j);

        //        LeetCode lc = new LeetCode();
        //        boolean res = lc.isValid("{[(]}");
        //        System.out.println(res);
        MinStack ms = new MinStack();
        for (int i = 100; i > 0; i--) {
            ms.push(new Random().nextInt(100));
        }
        System.out.println(ms.toString());
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());

        System.out.println(ms.top());
    }
}
