package com.hym.leetcode;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne66 {

    //搞复杂了
//    public int[] plusOne(int[] digits) {
//        int add = 1;
//        int len = digits.length;
//        for (int i = len-1; i >=0; i--) {
//            add = digits[i] + add;
//            digits[i] = add % 10;
//            add /= 10;
//        }
//        if (add == 0) {
//            return digits;
//        }else {
//            int arr[] = new int[len+1];
//            arr[0] = add;
//            for (int i = 0;i < len; i++) {
//                arr[i+1] = digits[i];
//            }
//            return arr;
//        }
//    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
