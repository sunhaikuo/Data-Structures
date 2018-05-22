package com.company.Link;

public interface ILinkedList<E> {
    /**
     * 向链表中增加数据
     *
     * @param index 索引
     * @param e 要插入的值
     */
    void add(int index, E e);

    /**
     * 增加第一个
     *
     * @param e 要增加的元素
     */
    void addFirst(E e);

    /**
     * 向最后一个增加元素
     *
     * @param e 要增加的元素
     */
    void addLast(E e);

    /**
     * 根据index值获取元素
     *
     * @param index 索引值
     * @return
     */
    E get(int index);

    /**
     * 获取第一个元素
     *
     * @return 返回值
     */
    E getFirst();

    /**
     * 获取最后一个元素
     *
     * @return 返回值
     */
    E getLast();

    /**
     * 根据index值替换元素
     *
     * @param index 索引值
     * @param e 要替换的元素
     */
    void set(int index, E e);

    /**
     * 是否包含元素
     *
     * @param e 元素值
     * @return true/false
     */
    boolean contains(E e);

    /**
     * 根据index值删除元素
     *
     * @param index 索引值
     * @return 要删除的元素
     */
    E remove(int index);

    /**
     * 删除第一个
     *
     * @return 被删除的元素
     */
    E removeFirst();

    /**
     * 删除最后一个
     *
     * @return 被删除的元素
     */
    E removeLast();

    /**
     * 链表的大小
     *
     * @return size
     */
    int size();

    /**
     * 链表是否为空
     *
     * @return 是否为空
     */
    boolean isEmpty();
}
