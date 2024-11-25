package com.hym.leetcode;

public class RemoveDuplicateLetters316 {

    public static String removeDuplicateLetters(String s) {
        int[] chars = new int[26];
        boolean[] vis = new boolean[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            chars[c - 'a']--;
            if (vis[c - 'a']){
                continue;
            }
            while (sb.length() != 0 && c < sb.charAt(sb.length()-1) && chars[sb.charAt(sb.length()-1) - 'a'] > 0) {
                vis[sb.charAt(sb.length()-1) - 'a'] = false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(c);
            vis[c - 'a'] = true;
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        System.out.println(removeDuplicateLetters("cbacb"));
        System.out.println(removeDuplicateLetters("cdacd"));
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
}
