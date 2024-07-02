package com.hym.italgorithmdata2nd;

import java.util.Stack;

/**
 * 【题目】
 * 一个栈中元素的类型为整型，现在想将该栈从顶到底按从大到小的顺序排序，只许申请一个栈。除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序？
 */
public class StackSortByStack {

    public static void sortStackByStack(Stack<Integer> stack){
        //用来存放从栈底到栈顶由大到小的数据
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int cur = stack.pop();

            while (!temp.isEmpty() &&  cur > temp.peek()) {
                stack.push(temp.pop());
            }

            temp.push(cur);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }

}
