package com.company.bst;

public class BST<E extends Comparable<E>> {
    private class Node {
        private E e;
        private Node left, right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            //            return "e=" + this.e + ", left=" + this.left + ", right=" + this.right +
            // "\n";
            return "e=" + this.e;
        }
    }

    private Node root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    public void add(E e) {
        //        if (root == null) {
        //            root = new Node(e);
        //            size++;
        //        } else {
        //            this.add(root, e);
        //        }
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        //        boolean eIsGreater = e.compareTo(node.e) > 0;
        //        Node insertNode = new Node(e);
        //        if (node.left == null && node.right == null) {
        //            if (eIsGreater) {
        //                node.right = insertNode;
        //            } else {
        //                node.left = insertNode;
        //            }
        //        } else if (node.left != null && node.right == null) {
        //            if (eIsGreater) {
        //                node.right = insertNode;
        //            } else {
        //                add(node.left, e);
        //            }
        //        } else if (node.left == null && node.right != null) {
        //            if (!eIsGreater) {
        //                node.left = insertNode;
        //            } else {
        //                add(node.right, e);
        //            }
        //        } else {
        //            if (eIsGreater) {
        //                add(node.right, e);
        //            } else {
        //                add(node.left, e);
        //            }
        //        }

        /* 正常逻辑的插入元素 */
        //        if (e.compareTo(node.e) == 0) {
        //            return;
        //        } else if (e.compareTo(node.e) > 0 && node.right == null) {
        //            node.right = new Node(e);
        //            size++;
        //            return;
        //        } else if (e.compareTo(node.e) < 0 && node.left == null) {
        //            node.left = new Node(e);
        //            size++;
        //            return;
        //        }
        //
        //        if (e.compareTo(node.e) > 0) {
        //            add(node.right, e);
        //        } else {
        //            add(node.left, e);
        //        }

        /* 使用递归插入元素 逻辑更简洁*/
        if (node == null) {
            node = new Node(e);
            return node;
        }
        if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        } else if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        }
        return node;
    }

    //    看二分搜索树中是否包含元素e
    public boolean contains(E e) {
        return false;
    }

    //    二分搜索树的前序遍历
    public void preOrder() {}

    private void preOrder(Node node) {}

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        getAll(root);
        return sb.toString();
    }

    private void getAll(Node node) {
        if (node.left != null) {
            getAll(node.left);
        }
        if (node.right != null) {
            getAll(node.right);
        }
        System.out.println(node.e);
    }
}
