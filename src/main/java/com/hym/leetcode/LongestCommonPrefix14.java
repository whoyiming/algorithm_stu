package com.hym.leetcode;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (String str : strs) {
            int len = Math.min(res.length(), str.length());
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < len; i++) {
                if (res.charAt(i) == str.charAt(i)) {
                    sb.append(res.charAt(i));
                } else {
                    break;
                }
            }
            res = sb.toString();
        }
        return res;
    }

    public static void main(String[] args){
        String[] strs = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
