package com.hym.leetcode;

public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
        int val_i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[val_i++] = num;
            }
        }
        return val_i;
    }

}
