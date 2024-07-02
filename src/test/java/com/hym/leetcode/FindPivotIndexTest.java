package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class FindPivotIndexTest {

    @Test
    public void test1(){
        Assert.assertEquals(3, FindPivotIndex.pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(-1, FindPivotIndex.pivotIndex(new int[]{1,2,3}));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0, FindPivotIndex.pivotIndex(new int[]{2,1,-1}));
    }

    @Test
    public void test4(){
        Assert.assertEquals(3, FindPivotIndex.pivotIndex2(new int[]{1,7,3,6,5,6}));
    }

    @Test
    public void test5(){
        Assert.assertEquals(-1, FindPivotIndex.pivotIndex2(new int[]{1,2,3}));
    }

    @Test
    public void test6(){
        Assert.assertEquals(0, FindPivotIndex.pivotIndex2(new int[]{2,1,-1}));
    }
}
