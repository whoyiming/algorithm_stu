package com.hym.leetcode;


import java.util.HashMap;
import java.util.Map;

public class StringToInteger8 {
    /*
      所犯的错误：
      1. 没有考虑 s 输入为空的情况
      2. 没有考虑 s.trim() 为空的情况
      3. 当进行到有数字的处理，没有判断是否为数字
      4. Integer.parseInt("MAX_VALUE+1") 是报错，即超过Integer.MAX_VALUE 的数字字符串用parseInt() 解析会报错
      5. Integer.MIN_VALUE + 1 会导致溢出，这是java的语法，默认赋值是int类型，如果要判断用long解析的数字是否大于MAX_VALUE，则可以使用long数据 - 1 >= Integer.MAX_VALUE
     */
    public int myAtoi_mine(String s) {
        if (s == null ) { return 0;}
        s = s.trim();
        if (s.length() == 0) { return 0;}
        boolean possitive = true;
        if (s.charAt(0) == '-') {
            possitive = false;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            possitive = true;
            s = s.substring(1);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }else {
                break;
            }

        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (sb.length() == 0) {
            return 0;
        }


        if (possitive) {
            if (sb.length() > 10 || Long.parseLong(sb.toString()) > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return Integer.parseInt(sb.toString());
        } else {
            if (sb.length() > 10 || Long.parseLong(sb.toString()) -1 >= Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }
            return -Integer.parseInt(sb.toString());
        }

    }

    /*
     看了leetcode后，再写的
  */
    public int myAtoi(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }

        int index = 0;
        int len = s.length();
        int res = 0;

        while (index < len && s.charAt(index) == ' ') {
            index++;
        }
        if (index == len){
            return 0;
        }
        boolean isNegative = s.charAt(index) == '-';
        if (isNegative || s.charAt(index) == '+'){
            index++;
        }

        while (index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int digit = s.charAt(index++) - '0';
            if ( res > (Integer.MAX_VALUE - digit) /10 ){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + digit;
        }

        return res * (isNegative ? -1 : 1);
    }

    /*
     * 自动机
     * 状态：  start  signed  in_number   end
     * 输入：  空格  正负号   数字  其他字符
     * 输出：  start  end    in_number end
     * 从leetcode.cn上看到的，这是一个思路
     */
    public int myAtoi_automation(String str) {
        Automaton automaton = new Automaton();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            automaton.get(str.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }


    class Automaton {
        public int sign = 1;
        public long ans = 0;
        private String state = "start";
        private Map<String, String[]> table = new HashMap<String, String[]>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        public void get(char c) {
            state = table.get(state)[get_col(c)];
            if ("in_number".equals(state)) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
            } else if ("signed".equals(state)) {
                sign = c == '+' ? 1 : -1;
            }
        }

        private int get_col(char c) {
            if (c == ' ') {
                return 0;
            }
            if (c == '+' || c == '-') {
                return 1;
            }
            if (Character.isDigit(c)) {
                return 2;
            }
            return 3;
        }
    }

}

