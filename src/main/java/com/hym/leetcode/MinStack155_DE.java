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
public class MinStack155_DE {//用了三个stack，写得不好,废弃
    Stack<Integer> stack;
    Stack<Integer> stackMin;

    Stack<Integer> stackTemp;
    public MinStack155_DE() {
        stack = new Stack<>();
        stackMin = new Stack<>();
        stackTemp = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (stackMin.isEmpty()) {
            stackMin.push(val);
        }  else if (val < stackMin.peek()) {
            stackMin.push(val);
        } else {
            while (!stackMin.isEmpty() && val > stackMin.peek()) {
                stackTemp.push(stackMin.pop());
            }

            stackMin.push(val);

            while (!stackTemp.isEmpty()) {
                stackMin.push(stackTemp.pop());
            }
        }

    }

    public void pop() {
        int val = stack.peek();
        while (val != stackMin.peek()) {
            stackTemp.push(stackMin.pop());
        }

        stackMin.pop();

        while (!stackTemp.isEmpty()) {
            stackMin.push(stackTemp.pop());
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }

}
