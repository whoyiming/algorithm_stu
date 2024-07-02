package com.hym.algorithm;

import com.hym.datastruct.StackCustom;

public class StackArr {
    private int top;
    private int[] arr;
    private int size;

    StackArr(int size){
        arr = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int num){
        if (top == size-1) {
            System.out.println("满了");
        }else {
            top++;
            arr[top] = num;
        }
    }

    public int peek(){
        if (top == -1){throw new RuntimeException("stack is empty");}
        return arr[top];
    }

    public int pop(){
        if (top == -1){throw new RuntimeException("stack is empty");}
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public  void printStack(StackArr stack) {
        if(top>=0)
        {
            System.out.println("Elements of stacks are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public StackArr sortStack(StackArr stackArr){
        StackArr stackSorted = new StackArr(size);
        while (!stackArr.isEmpty()){
            int cur = stackArr.pop();
            while (!stackSorted.isEmpty() && stackSorted.peek() < cur) {
                stackArr.push(stackSorted.pop());
            }
            stackSorted.push(cur);

        }
        return stackSorted;
    }


    public static void main(String[] args){
        StackArr stackArr = new StackArr(10);
        System.out.println("=================");
        stackArr.push(30);
        stackArr.push(10);
        stackArr.push(50);
        stackArr.push(40);
        stackArr.printStack(stackArr);
        StackArr stackSorted = stackArr.sortStack(stackArr);
        stackSorted.printStack(stackSorted);


    }
}
