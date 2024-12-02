package com.hym.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumClosestTest {


    @Test
    public void testThreeSumClosestNormalCase() {
        ThreeSumClosest16 sol = new ThreeSumClosest16();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = sol.threeSumClosest(nums, target);
        assertEquals(2, result);
    }

    @Test
    public void testThreeSumClosestNegativeNumbers() {
        ThreeSumClosest16 sol = new ThreeSumClosest16();
        int[] nums = {-1, -2, -3, -4};
        int target = -10;
        int result = sol.threeSumClosest(nums, target);
        assertEquals(-9, result);
    }

    @Test
    public void testThreeSumClosestPositiveNumbers() {
        ThreeSumClosest16 sol = new ThreeSumClosest16();
        int[] nums = {1, 2, 3, 4};
        int target = 10;
        int result = sol.threeSumClosest(nums, target);
        assertEquals(9, result);
    }

    @Test
    public void testThreeSumClosestZeroTarget() {
        ThreeSumClosest16 sol = new ThreeSumClosest16();
        int[] nums = {-1, 0, 1, 2};
        int target = 0;
        int result = sol.threeSumClosest(nums, target);
        assertEquals(0, result);
    }

    @Test
    public void testThreeSumClosestDuplicateNumbers() {
        ThreeSumClosest16 sol = new ThreeSumClosest16();
        int[] nums = {-1, -1, -1, 0, 1, 1, 1};
        int target = 0;
        int result = sol.threeSumClosest(nums, target);
        assertEquals(0, result);
    }

}