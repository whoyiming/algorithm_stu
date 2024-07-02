package com.hym.leetcode;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) { return false; }
        if (s.trim().length() <=1 ) { return false; }
        s = s.replaceAll("\\W","").toLowerCase();
        for (int i=0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i -1)) {
                return false;
            }
        }

        return true;
    }
}
