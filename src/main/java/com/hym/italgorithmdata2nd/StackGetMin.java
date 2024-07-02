package com.hym.italgorithmdata2nd;

import java.util.Stack;

/**
 * 【题目】
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 * 【要求】
 * 1.pop、push、getMin操作的时间复杂度都是O(1)。
 * 2．设计的栈类型可以使用现成的栈结构。
 */
public class StackGetMin {

    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public int pop(){
        if (stackData.isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        int value = stackData.pop();
        if (value == stackMin.peek()) {
            stackMin.pop();
        }

        return value;
    }

    public void push(int newNum){
        stackData.push(newNum);
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= stackMin.peek()) {
            stackMin.push(newNum);
        }

    }

    public int getMin(){
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }

        return stackMin.peek();
    }

}
