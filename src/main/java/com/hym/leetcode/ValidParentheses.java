package com.hym.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        if(s == null) {return false;}
        if(s.length() == 0) {return true;}
        Stack<Character> stack = new Stack();
        for(int i=0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != null) {
                if(stack.empty()){return false;}
                if(stack.pop().equals(map.get(s.charAt(i)) )){
                    continue;
                }else{
                    return false;
                }

            }else{
                stack.push(s.charAt(i));
            }
        }
        if(!stack.empty()){return false;}
        return true;
    }

}
