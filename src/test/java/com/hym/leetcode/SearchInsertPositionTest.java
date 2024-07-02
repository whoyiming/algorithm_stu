package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void test1(){
        Assert.assertEquals(2,SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void test3(){
        Assert.assertEquals(4,SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void test4(){
        Assert.assertEquals(0,SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void test5(){
        Assert.assertEquals(3,SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 6));
    }
}
