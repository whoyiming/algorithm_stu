package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {

    ThreeSum15 ts = new ThreeSum15();

    @Test
    public void test1(){
        int nums[] = new int[] {-1,0,1,2,-1,-4};
        //[[-1,-1,2],[-1,0,1]]
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(-1);
        l.add(-1);
        l.add(2);
        lists.add(l);
        l = new ArrayList<>();
        l.add(-1);
        l.add(0);
        l.add(1);
        lists.add(l);
        Assert.assertEquals(true, ts.threeSum(nums).equals(lists));

    }

    @Test
    public void test2(){
        int nums[] = new int[] {-2,0,1,1,2};
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(-2);
        l.add(0);
        l.add(2);
        lists.add(l);
        l = new ArrayList<>();
        l.add(-2);
        l.add(1);
        l.add(1);
        lists.add(l);
        Assert.assertEquals(true, ts.threeSum(nums).equals(lists));

    }
}
