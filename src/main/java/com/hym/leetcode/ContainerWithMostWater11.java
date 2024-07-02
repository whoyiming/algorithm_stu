package com.hym.leetcode;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * Example 2:
 *
 * Input: height = [1,1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
public class ContainerWithMostWater11 {

//    public static int maxArea(int[] height) {
//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = height.length - 1; j > i; j--) {
//                int rel = Math.min(height[i], height[j]) * (j - i);
//                max = Math.max(max, rel);
//
//                if (height[j] > height[i]) {
//                    break;
//                }
//            }
//        }
//
//        return max;
//    }

    public static int maxArea(int[] height){
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (j > i) {
            max = height[i] > height[j] ?
                    Math.max(max, (j - i) * height[j--] ) : Math.max(max, (j - i) * height[i++]);
            //此处j-i要放在前面，再进行j-- i++运算；如果放在后面j-- i++运算后，再进行j-i操作
        }

        return max;
    }

//    public static int maxArea(int[] height) {
//        int i = 0, j = height.length - 1;
//        int max = 0;
//        while (i < j) {
//            if (height[i] > height[j]) {
//                int area = height[j] * (j - i);
//                if (max < area) {
//                    max = area;
//                }
//                int c = height[j];
//                while (j >= 0 && height[j] <= c) {
//                    j--;
//                }
//            } else {
//                int area = height[i] * (j - i);
//                if (max < area) {
//                    max = area;
//                }
//                int c = height[i];
//                while (i < height.length && height[i] <= c) {
//                    i++;
//                }
//            }
//        }
//        return max;
//    }
}
