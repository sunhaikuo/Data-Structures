package com.company.Link;

public class TestLinkedList {
    public static void test() {
        LinkedList_0522<Integer> link = new LinkedList_0522<>();
        for (int i = 0; i < 10; i++) {
            link.add(i, i);
        }
        System.out.println("增加0-9共10个元素：" + link);

        link.addFirst(666);
        link.addLast(777);
        System.out.println("首增加666，尾增加777：" + link);

        System.out.println("是否包含7：" + link.contains(7));

        link.set(0, 100);
        System.out.println("把第0个元素设置成100：" + link);

        link.remove(0);
        System.out.println("删除第1个元素：" + link);
        link.removeLast();
        System.out.println("删除第最后一个元素：" + link);
    }
}
