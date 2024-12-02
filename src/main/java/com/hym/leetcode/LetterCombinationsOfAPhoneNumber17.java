package com.hym.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber17 {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if (digits == null || digits.isEmpty()) {
            return ans;
        }
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // tips:初始化，ans中添加一个空字符串，方便后续的拼接操作，不用判断是否为空
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            while (ans.peek().length() == i) {
                String s = ans.poll();
                for (char c : mapping[digit].toCharArray()) {
                    ans.add(s + c);
                }
            }
        }

        return ans;
    }

    // 回溯法
    public List<String> letterCombinations_backtrack(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(combinations, mapping, digits, 0, new StringBuilder());
        return combinations;
    }

    private void backtrack(List<String> combinations, String[] mapping, String digits, int index, StringBuilder combination) {
        // 终结条件：到达数字的末尾，组合完成
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }

        String digit = mapping[digits.charAt(index) - '0'];
        for (char c : digit.toCharArray()) {
            // 将当前字母添加到组合中
            combination.append(c);
            // 递归调用backtrack方法，处理下一个数字
            backtrack(combinations, mapping, digits, index + 1, combination);
            // 回溯，删除刚刚添加的字母，以便尝试下一个字母
            combination.deleteCharAt(index);
        }
    }

}
