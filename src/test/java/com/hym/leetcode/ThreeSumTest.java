package com.hym.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum15 threeSum = new ThreeSum15();
    
        // Test case 1: Basic test with positive numbers
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = threeSum.threeSum(nums1);
        assertEquals(2, result1.size());
        assertEquals(Arrays.asList(-1, -1, 2), result1.get(0));
        assertEquals(Arrays.asList(-1, 0, 1), result1.get(1));
    
        // Test case 2: Basic test with negative numbers
        int[] nums2 = {-1, 2, 3, -4, -5};
        List<List<Integer>> result2 = threeSum.threeSum(nums2);
        assertEquals(1, result2.size());
        assertEquals(Arrays.asList(-5, 2, 3), result2.get(0));
    
        // Test case 3: Test with a mix of positive and negative numbers
        int[] nums3 = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 5};
        List<List<Integer>> result3 = threeSum.threeSum(nums3);
        assertEquals(9, result3.size());
        assertEquals(Arrays.asList(-4, -1, 5), result3.get(0));
        assertEquals(Arrays.asList(-2, -1, 3), result3.get(1));
        assertEquals(Arrays.asList(-1, -1, 2), result3.get(2));
        assertEquals(Arrays.asList(-3, -2, 5), result3.get(3));
        assertEquals(Arrays.asList(-4, 1, 3), result3.get(4));
        assertEquals(Arrays.asList(-3, 1, 2), result3.get(5));
        assertEquals(Arrays.asList(-3, 0, 3), result3.get(6));
        assertEquals(Arrays.asList(-2, 0, 2), result3.get(7));
        assertEquals(Arrays.asList(-1, 0, 1), result3.get(8));
    
        // Test case 4: Test with no solution
        int[] nums4 = {0, 1, 2};
        List<List<Integer>> result4 = threeSum.threeSum(nums4);
        assertEquals(0, result4.size());
    
        // Test case 5: Test with single element
        int[] nums5 = {0};
        List<List<Integer>> result5 = threeSum.threeSum(nums5);
        assertEquals(0, result5.size());
    
        // Test case 6: Test with three elements
        int[] nums7 = {0, 0, 0};
        List<List<Integer>> result7 = threeSum.threeSum(nums7);
        assertEquals(1, result7.size());
        assertEquals(Arrays.asList(0, 0, 0), result7.get(0));
    }

}