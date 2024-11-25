package com.hym.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

    //TODO
    //    public int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        Set<Character> charSet = new HashSet<>();
//        int left = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//            if (!charSet.contains(s.charAt(right))) {
//                charSet.add(s.charAt(right));
//                maxLength = Math.max(maxLength, right - left + 1);
//            } else {
//                while (charSet.contains(s.charAt(right))) {
//                    charSet.remove(s.charAt(left));
//                    left++;
//                }
//                charSet.add(s.charAt(right));
//            }
//        }
//
//        return maxLength;
//    }

//    public int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        Map<Character, Integer> charMap = new HashMap<>();
//        int left = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//            // 如果当前字符不在charMap中
//            // 或者即使在当前窗口中，该字符的上次出现位置也在左边界之外，则将该字符加入charMap中
//            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left ) {
//                charMap.put(s.charAt(right), right);
//                maxLength = Math.max(maxLength, right - left + 1);
//            } else {
//                // 移动左边界到重复字符的下一个位置
//                left = charMap.get(s.charAt(right)) + 1;
//                charMap.put(s.charAt(right), right);
//            }
//        }
//
//        return maxLength;
//    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int[] charIndex = new int[128];
        // 将数组所有元素初始化为-1，表示字符尚未出现过
        Arrays.fill(charIndex, -1);
        // 初始化滑动窗口的左边界
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // 如果当前字符在滑动窗口内出现过（即其索引大于等于left）
            if (charIndex[s.charAt(right)] >= left) {
                // 更新左边界为当前字符上次出现位置的下一个索引
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
