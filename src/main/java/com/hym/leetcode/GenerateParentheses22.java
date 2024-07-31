package com.hym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

    List<String> list;

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        recurParentheses(0, 0, n, "");
        return list;
    }

    private void recurParentheses(int left, int right, int n, String s) {
        // terminator
        if (left == n && right == n) {
            list.add(s);
            return;
        }
        // process current logic

        // drill down
        if (left < n) {
            recurParentheses(left + 1, right, n, s + "(");
        }
        if (right < left) {
            recurParentheses(left, right + 1, n, s + ")");
        }

        // restore current status

    }


}
