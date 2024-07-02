package com.hym.italgorithmdata2nd;

import java.util.Stack;

/**
 * 【题目】
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）。
 */
public class TwoStackQueue {

    Stack<Integer> stackPush = new Stack<>();
    Stack<Integer> stackPop = new Stack<>();

    public void add(int newData){
        while (!stackPop.isEmpty()){
            stackPush.push(stackPop.pop());
        }
        stackPush.push(newData);
    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()) {
            throw  new RuntimeException("Queue is empty! ");
        }

        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()) {
            throw  new RuntimeException("Queue is empty! ");
        }

        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
        return stackPop.peek();
    }


}
