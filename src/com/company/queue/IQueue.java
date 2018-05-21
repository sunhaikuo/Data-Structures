package com.company.queue;

public interface IQueue<E> {
    //    入队
    void enqueue(E e);

    //    出队
    E dequeue();

    //    查看队首的元素
    E getFront();

    //    栈的元素个数
    int size();

    //    栈是否为空
    boolean isEmpty();

    //    栈是否已满
    boolean isFull();
}
