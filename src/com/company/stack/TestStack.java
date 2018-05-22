package com.company.stack;

public class TestStack {
    public static void test() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println("向栈中增加0-9共10个元素：" + stack);
        }

        for (int i = 0; i < 5; i++) {
            stack.pop();
            System.out.println("出栈元素：" + stack);
        }

        //        System.out.println("栈顶元素为：" + stack.peek());
        //
        //        System.out.println("栈是否为空：" + stack.isEmpty());
    }
}
