package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ThreeConsecutiveOddsTest {

    @Test
    public void test1(){
        int  arr[] = new int[]{2,6,4,1};
        Assert.assertEquals(ThreeConsecutiveOdds1550.threeConsecutiveOdds(arr),false);
    }

    @Test
    public void test2(){
        int  arr[] = new int[]{1,2,34,3,4,5,7,23,12};
        Assert.assertEquals(ThreeConsecutiveOdds1550.threeConsecutiveOdds(arr),true);
    }
}
