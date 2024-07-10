package com.hym.sword_pointing_offer;

import java.util.Arrays;

/**
 * 题目：输入一个非负数n ，请计算0到n 之间每个数字的二进制形式中1的个数，并输出一个数组。例如，输入的n
 * 为4，由于0、1、2、3、4的二进制形式中1的个数分别为0、1、1、2、1，因此输出数组[0，1，1，2，1]。
 */
public class CountBits3 {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int j = i;
            while (j != 0) {
                result[i]++;
                j = j & (j - 1);
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args){
        CountBits3 cb = new CountBits3();
        cb.countBits(10);
    }
}
