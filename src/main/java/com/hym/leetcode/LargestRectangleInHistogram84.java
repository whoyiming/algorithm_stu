package com.hym.leetcode;

public class LargestRectangleInHistogram84 {

    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) { return heights[0]; }
        int maxArea = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            int minHeight = heights[i];
            if (minHeight == 0) {
                continue;
            }
            int width = 0;
            for (int j = i+1; j < heights.length; j++) {
                if (heights[j] == 0) {
                    // （j-1）代表 j 处在的长度不用算进去
                    width = (j-1) - i + 1;
                    // 代表将外层循环跳到数组位置j处
                    i = j;
                    break;
                } else {
                    minHeight = Math.min(Math.min(heights[i], heights[j]), minHeight);
                    width = j - i + 1;
                }

                int area = minHeight * width;
                maxArea = Math.max(maxArea,area);
            }

        }

        return maxArea;
    }

}
