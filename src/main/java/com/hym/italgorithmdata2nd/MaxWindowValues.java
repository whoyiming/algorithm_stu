package com.hym.italgorithmdata2nd;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *【题目】
 * 有一个整型数组arr和一个大小为w的窗口从数组的最左边滑到最右边，窗口每次向右边滑一个位置。
 * 例如，数组为[4,3,5,4,3,3,6,7]，窗口大小为3时：
 *         [4  3  5] 4  3  3  6  7            窗口中最大值为5
 *          4 [3  5  4] 3  3  6  7            窗口中最大值为5
 *          4  3 [5  4  3] 3  6  7            窗口中最大值为5
 *          4  3  5 [4  3  3] 6  7            窗口中最大值为4
 *          4  3  5  4 [3  3  6] 7            窗口中最大值为6
 *          4  3  5  4  3 [3  6  7]           窗口中最大值为7
 * 如果数组长度为n，窗口大小为w，则一共产生n-w+1个窗口的最大值。
 * 请实现一个函数。
 * · 输入：整型数组arr，窗口大小为w 。
 * · 输出：一个长度为n-w+1的数组res, res[i]表示每一种窗口状态下的最大值。
 * 以本题为例，结果应该返回{5,5,5,4,6,7}。
 */
public class MaxWindowValues {

    public static int[] getMaxWindow(int[] arr, int w){
        int arrLen = arr.length;
        if (arrLen == 0 || arrLen < w ){
            return null;
        }

        LinkedList<Integer> indexMax = new LinkedList<Integer>();
        int[] res = new int[arrLen - w +1];
        int index = 0;

        for (int i=0; i<arrLen; i++) {
            while (!indexMax.isEmpty() && arr[indexMax.peekLast()] <= arr[i]) {
                indexMax.pollLast();
            }

            indexMax.addLast(i);

            if (indexMax.peekFirst() == i - w) {
                indexMax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[indexMax.peekFirst()];
            }

        }

        return res;
    }
    
    public static void main(String[] args){
        System.out.println(Arrays.toString(getMaxWindow(new int[]{4,3,5,4,3,3,6,7},3)));
    }
}
