package com.hym.leetcode;

public class ZigzagConversion6 {

    public String convert(String s, int numRows) {
        if (numRows < 2 || s.length() < 2 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int len = s.length();
        int i = 0;
        while (i < len) {
            for (int row = 0; row < numRows && i < len; row++) {
                rows[row].append(s.charAt(i++));
            }
            for (int row = numRows - 2; row > 0 && i< len; row--) {
                rows[row].append(s.charAt(i++));
            }
        }

        for (int row = 1; row < numRows; row++) {
            rows[0].append(rows[row]);
        }
        return rows[0].toString();
    }
}
