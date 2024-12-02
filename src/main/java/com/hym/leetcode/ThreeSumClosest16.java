package com.hym.leetcode;

import java.util.Arrays;

public class ThreeSumClosest16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {return sum;}
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum > target) {
                    j--;

                    // skip duplicates
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else {
                    i++;

                    // skip duplicates
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                }
            }
        }
        return closest;
    }

}
