package com.company;

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
        //        MinStack ms = new MinStack();
        //        for (int i = 100; i > 0; i--) {
        //            ms.push(new Random().nextInt(100));
        //        }
        //        System.out.println(ms.toString());
        //        System.out.println(ms.getMin());
        //        ms.pop();
        //        System.out.println(ms.getMin());
        //        ms.push(-3);
        //        System.out.println(ms.getMin());
        //        ms.pop();
        //        System.out.println(ms.getMin());
        //
        //        System.out.println(ms.top());

        //        QuickSort1 qc = new QuickSort1();
        //        qc.sort();
        //        LinkedList<Integer> ll = new LinkedList<>();
        //        for (int i = 0; i < 10; i++) {
        //            ll.addFirst(i);
        //        }
        //        System.out.println(ll);
        //
        //        ll.addFirst(666);
        //        System.out.println(ll);
        //
        //        ll.addLast(999);
        //        System.out.println(ll);
        //
        //        ll.removeFirst();
        //        System.out.println(ll);
        //
        //        ll.removeLast();
        //        System.out.println(ll);
        int[] arr = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int s = Main.removeDuplicates(arr);
        for (int i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return length;
        }
        int j = 0;
        int current = nums[j];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                j++;
                nums[j] = nums[i];
                current = nums[j];
            } else {
                continue;
            }
        }
        return j + 1;
    }
}
