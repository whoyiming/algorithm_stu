package com.hym.leetcode;

import java.util.*;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Map<Character, HashSet<Character>> map = new HashMap<Character, HashSet<Character>>();
        for (int i=0;i<cs.length;i++){
            if (map.get(cs[i]) == null) {
                HashSet<Character> set = new HashSet<>();
                set.add(ct[i]);
                map.put(cs[i],set);
            } else {
                HashSet<Character> set = map.get(cs[i]);
                set.add(ct[i]);
                map.put(cs[i],set);
            }
        }

        for (Set set : map.values()) {
            if (set.size() > 1) {
                return false;
            }
        }

        return true;
    }

}
