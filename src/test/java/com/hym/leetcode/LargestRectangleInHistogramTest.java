package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram84 lrih = new LargestRectangleInHistogram84();

    @Test
    public void test1(){
        int[] heights = new int[]{2,1,5,6,2,3};
        Assert.assertEquals(10, lrih.largestRectangleArea(heights));
    }

    @Test
    public void test2(){
        int[] heights = new int[]{2,4};
        Assert.assertEquals(4, lrih.largestRectangleArea(heights));
    }

    @Test
    public void test3(){
        int[] heights = new int[]{2};
        Assert.assertEquals(2, lrih.largestRectangleArea(heights));
    }

    @Test
    public void test4(){
        int[] heights = new int[]{0,9};
        Assert.assertEquals(9, lrih.largestRectangleArea(heights));
    }

    @Test
    public void test5(){
        int[] heights = new int[]{0,9,0,9,8};
        Assert.assertEquals(16, lrih.largestRectangleArea(heights));
    }

    @Test
    public void test6(){
        int[] heights = new int[]{9,0};
        Assert.assertEquals(9, lrih.largestRectangleArea(heights));
    }

    @Test
    public void test7(){
        int[] heights = new int[]{9,9,0,0,9};
        Assert.assertEquals(18, lrih.largestRectangleArea(heights));
    }
}