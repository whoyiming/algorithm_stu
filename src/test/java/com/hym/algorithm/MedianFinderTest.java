package com.hym.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class MedianFinderTest {

    MedianFinder medianFinder = new MedianFinder();

    @Test
    public void test1() {
        medianFinder.addNum(1);
        Assert.assertEquals(1.0, medianFinder.findMedian(),0.0);
    }

    @Test
    public void test2() {
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        Assert.assertEquals(2.0, medianFinder.findMedian(),0.0);
    }

    @Test
    public void test3() {
        medianFinder.addNum(3);
        medianFinder.addNum(2);
        medianFinder.addNum(9);
        medianFinder.addNum(6);
        Assert.assertEquals(4.5, medianFinder.findMedian(),0.0);
    }

    @Test
    public void test4() {
        medianFinder.addNum(3);
        medianFinder.addNum(2);
        medianFinder.addNum(9);
        medianFinder.addNum(6);
        medianFinder.addNum(7);
        Assert.assertEquals(6.0, medianFinder.findMedian(),0.0);
    }
}
