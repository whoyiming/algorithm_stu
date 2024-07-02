package com.hym.leetcode;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 *
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */
public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s){
        int len = s.length() - 1;
        int count = 0;
        boolean isCharacter = false;
        while (len >= 0) {
            if (isCharacter && s.charAt(len) == ' ') {
                return count;
            }  else if (isCharacter && s.charAt(len) != ' ') {
                count++;
            } else if (!isCharacter && s.charAt(len) != ' ') {
                isCharacter = true;
                count++;
            }
            len--;
        }
        return count;
    }

//    public static int lengthOfLastWord(String s) {
//        int len = s.length()-1;
//        int count = 0;
//        int space = 0;
//
//        while (len >= 0) {
//            if (s.charAt(len) == ' ') {
//                if (space == -1) {
//                    return count;
//                }
//            } else {
//                count++;
//                space = -1;
//            }
//            len--;
//        }
//
//        return count;
//    }

//    public static int lengthOfLastWord(String s){
//        String[] str = s.split(" ");
//        return str[str.length-1].length();
//    }
}
