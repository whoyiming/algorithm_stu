package com.hym.leetcode;

public class RomanToInteger13 {

    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int curr = convertRoman(c);
            if (curr >= prev) {
                sum += curr;
            } else {
                sum -= curr;
            }
            prev = curr;
        }
        return sum;
    }

    private int convertRoman(char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
