package com.hym.leetcode;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */
public class ThreeSum15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int k = 0; k< nums.length - 2; k++) {
            // Skip duplicates
            if (k > 0 && nums[k] == nums[k-1]) {continue;}
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    set.add(Arrays.asList(nums[k],nums[i++],nums[j--]));
                    // Skip duplicates
                    while (i < j && nums[i] == nums[i-1]) {i++;}
                    while (i < j && nums[j] == nums[j+1]) {j--;}
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    j--;
                } else if (nums[i] + nums[j] + nums[k] <0) {
                    i++;
                }
            }
        }
        return new ArrayList<>(set);
    }

}
