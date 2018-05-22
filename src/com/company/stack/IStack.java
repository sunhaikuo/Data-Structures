package com.company.stack;

public interface IStack<E> {
    /**
     * 入栈
     *
     * @param e 要入栈的元素
     */
    void push(E e);

    /**
     * 出栈
     *
     * @return 出栈的元素
     */
    E pop();

    /**
     * 查看栈顶的元素
     *
     * @return 栈顶的元素
     */
    E peek();

    /**
     * 栈的元素个数
     *
     * @return 元素个数
     */
    int size();

    /**
     * 栈是否为空
     *
     * @return true/false
     */
    boolean isEmpty();
}
