package com.hym.italgorithmdata2nd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackSortByStackTest {

    Stack<Integer> stack = new Stack<Integer>();
    @Test
    public void test1(){
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        StackSortByStack.sortStackByStack(stack);
        Assert.assertEquals(6, (int)stack.peek());
        System.out.println(stack);
    }

    @Test
    public void test2(){
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        StackSortByStack.sortStackByStack(stack);
        Assert.assertEquals(6, (int)stack.peek());
        System.out.println(stack);
    }

    @Test
    public void test3(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        StackSortByStack.sortStackByStack(stack);
        Assert.assertEquals(6, (int)stack.peek());
        System.out.println(stack);
    }
}
