package com.hym.leetcode;

/**
 * 根据在leetcode上提交的结果来看，要考虑字符串为一个的时候，属于palindromic，
 * 当整个字符串全部查找完毕，没有匹配到palindromic，则返回第一个字符作为结果。
 * 在正式的面试场景中，要仔细审题，并和面试官沟通相关的情况。
 *
 * 此题难点也在于如何处理字符串长度的偶奇行
 */
public class LongestPalindromicSubstring5 {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        if (s.length() == 1) return s;

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // 以当前字符为中心，向两边扩展，寻找奇数长度的回文子串
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > res.length()) {
                res = oddPalindrome;
            }

            // 以当前字符和下一个字符之间的间隙为中心，向两边扩展，寻找偶数长度的回文子串
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > res.length()) {
                res = evenPalindrome;
            }
        }
        return res;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
