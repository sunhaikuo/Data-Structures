package com.company.stack;

public interface IStack<E> {
    //    出栈
    void push(E e);

    //    入栈
    E pop();

    //    查看栈顶的元素
    E peek();

    //    栈的元素个数
    int size();

    //    栈是否为空
    boolean isEmpty();
}
