package com.hym.leetcode;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes283 {

//    public static void moveZeroes(int[] nums) {
//        int cnt = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                cnt++;
//            } else if (cnt > 0) {
//                nums[i-cnt] = nums[i];
//                nums[i] = 0;
//            }
//        }
//    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {return;}

        int insertIndex = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex++] = num;
            }
        }

        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
    }

}
