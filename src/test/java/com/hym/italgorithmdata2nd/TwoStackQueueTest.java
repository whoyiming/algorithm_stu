package com.hym.italgorithmdata2nd;

import org.junit.Assert;
import org.junit.Test;

public class TwoStackQueueTest {
    TwoStackQueue twoStackQueue = new TwoStackQueue();
    @Test
    public void test1(){
        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);
        Assert.assertEquals(1, twoStackQueue.peek());
        Assert.assertEquals(1, twoStackQueue.poll());
        Assert.assertEquals(2, twoStackQueue.poll());

        twoStackQueue.add(4);
        twoStackQueue.add(5);
        twoStackQueue.add(6);
        Assert.assertEquals(3, twoStackQueue.peek());
        Assert.assertEquals(3, twoStackQueue.poll());
        Assert.assertEquals(4, twoStackQueue.poll());

        twoStackQueue.add(7);
        twoStackQueue.add(8);
        twoStackQueue.add(9);
        Assert.assertEquals(5, twoStackQueue.poll());
        Assert.assertEquals(6, twoStackQueue.poll());
        Assert.assertEquals(7, twoStackQueue.peek());
    }

}
