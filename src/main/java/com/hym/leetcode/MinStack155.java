package com.hym.leetcode;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 */
public class MinStack155 {
//    Stack<Integer> stack;
//    Stack<Integer> stackMin;
//
//    public MinStack155() {
//        stack = new Stack<>();
//        stackMin = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//
//        if (stackMin.isEmpty() || val <= stackMin.peek()) {
//            stackMin.push(val);
//        }
//    }
//
//    public void pop() {
//        int val = stack.pop();
//
//        if (val == stackMin.peek()) {
//            stackMin.pop();
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return stackMin.peek();
//    }

    //采用node
    private Node head;
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
            // 上面的代码相当于下面这些代码，每插入一个节点，都是往head处插入，再把插入的节点变成head。妙~
//            Node temp = new Node();
//            temp.val = val;
//            temp.min = Math.min(val, head.min);
//            temp.next = head;
//            head = temp;
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        public Node() {}
        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
