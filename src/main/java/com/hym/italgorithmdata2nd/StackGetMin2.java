package com.hym.italgorithmdata2nd;

import java.util.Stack;

public class StackGetMin2 {

    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public int pop(){
        if (stackData.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        stackMin.pop();
        return stackData.pop();
    }

    public void push(int newData){
        stackData.push(newData);
        if (stackMin.isEmpty()){
            stackMin.push(newData);
        } else if (newData <= newData) {
            stackMin.push(newData);
        } else {
            stackMin.push(stackMin.peek());
        }
    }

    public int getMin(){
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        return stackMin.peek();
    }
}
