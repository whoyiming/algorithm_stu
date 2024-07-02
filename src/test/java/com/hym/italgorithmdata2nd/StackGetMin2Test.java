package com.hym.italgorithmdata2nd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackGetMin2Test {

    StackGetMin stackGetMin = new StackGetMin();
    @Before
    public void before(){
        stackGetMin.push(3);
        stackGetMin.push(4);
        stackGetMin.push(5);
        stackGetMin.push(1);
        stackGetMin.push(2);
        stackGetMin.push(1);
    }

    @Test
    public void test1(){
        System.out.println(stackGetMin.stackData);
        Assert.assertEquals(1, stackGetMin.getMin());
    }

    @Test
    public void test2(){
        stackGetMin.pop();
        System.out.println(stackGetMin.stackData);
        Assert.assertEquals(1, stackGetMin.getMin());
    }

    @Test
    public void test3(){
        stackGetMin.pop();
        stackGetMin.pop();
        System.out.println(stackGetMin.stackData);
        Assert.assertEquals(1, stackGetMin.getMin());
    }

    @Test
    public void test4(){
        stackGetMin.pop();
        stackGetMin.pop();
        stackGetMin.pop();
        System.out.println(stackGetMin.stackData);
        Assert.assertEquals(3, stackGetMin.getMin());
    }
}
