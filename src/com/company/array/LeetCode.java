package com.company.array;

import com.company.queue.PriorityQueue;
import com.company.stack.Stack;

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

    //    26.删除排序数组中的重复项
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    //    20. 有效的括号
    public boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>(length);
        for (int i = 0; i < length; i++) {
            char val = s.charAt(i);
            if (val == '{' || val == '[' || val == '(') {
                stack.push(val);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != '{' && val == '}') {
                    return false;
                }
                if (top != '[' && val == ']') {
                    return false;
                }
                if (top != '(' && val == ')') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
