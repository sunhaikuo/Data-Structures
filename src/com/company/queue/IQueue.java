package com.company.queue;

public interface IQueue<E> {
    /**
     * 入队
     *
     * @param e 元素
     */
    void enqueue(E e);

    /**
     * 出队
     *
     * @return 元素
     */
    E dequeue();

    /**
     * 查看队首的元素
     *
     * @return 元素
     */
    E getFront();

    /**
     * 栈的元素个数
     *
     * @return 元素
     */
    int size();

    /**
     * 栈是否为空
     *
     * @return 元素
     */
    boolean isEmpty();

    /**
     * 栈是否已满
     *
     * @return true/false
     */
    boolean isFull();
}
