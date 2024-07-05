package com.hym.leetcode;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 * Follow up:
 *
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class RotateArray189 {

    //当数组元素非常多时，运行非常耗时
    //Bruce Force
//    public void rotate(int[] nums, int k) {
//        if (nums.length == 0 || k == 0) { return; }
//        int cnt = 1;
//        int len = k % nums.length;
//        while (cnt <= len) {
//            int temp = nums[nums.length-1];
//
//            for (int i = nums.length - 1; i > 0; i--) {
//                nums[i] = nums[i-1];
//            }
//            nums[0] = temp;
//            cnt++;
//        }
//    }

    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) { return; }
        k %= nums.length;

        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end - 1];
            nums[end - 1] = temp;
            start++;
            end--;
        }
    }

}
