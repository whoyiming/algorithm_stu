package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {
    MinStack155 ms = new MinStack155();

    @Test
    public void test1(){
        ms.push(-2);
        ms.push(0);
        ms.push(-3);

        Assert.assertEquals(ms.getMin(), -3);
        ms.pop();
        ms.top();
        Assert.assertEquals(ms.getMin(), -2);

    }

    @Test
    public void test2(){
        ms.push(0);
        ms.push(1);
        ms.push(0);

        Assert.assertEquals(ms.getMin(), 0);
        ms.pop();
        Assert.assertEquals(ms.getMin(), 0);

    }
}
