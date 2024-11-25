package com.hym.leetcode;

public class PalindromeNumber9 {

    public static boolean isPalindrome(int x) {
        int val = x;
        if (x < 0) {
            return false;
        }
        int convert = 0;
        while (x > 0) {
            convert = convert * 10 + x % 10;
            x = x/10;
        }
        return val == convert;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(12));
    }
}
