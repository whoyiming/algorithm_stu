package com.hym.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum1 {

    //bruce force
//    public static int[] twoSum(int[] nums, int target) {
//        int arr[] = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                    return arr;
//                }
//            }
//        }
//        return arr;
//    }

    //Two-pass HashMap
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        int arr[] = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer val = map.get(target-nums[i]);
//            if (val != null && i != val) {
//                arr[0] = i;
//                arr[1] = val;
//                return arr;
//            }
//        }
//
//        return arr;
//    }

    //One-pass HashMap
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                arr[0] = map.get(complement);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }

        return arr;
    }

}
