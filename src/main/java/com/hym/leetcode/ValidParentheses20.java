package com.hym.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        Map<Character,Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put(']', '[');
//        map.put('}', '{');
//
//        for (char c : s.toCharArray()) {
//            if (c == '(' || c == '[' || c =='{') {
//                stack.add(c);
//            } else if (c == ')' || c == ']' || c== '}') {
//                if (stack.isEmpty() || map.get(c) != stack.pop()) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add(')');
            } else if (c == '[') {
                stack.add(']');
            } else if (c == '{') {
                stack.add('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }

        return stack.isEmpty();
    }

}
