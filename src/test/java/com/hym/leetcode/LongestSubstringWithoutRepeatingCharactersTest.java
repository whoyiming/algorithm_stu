package com.hym.leetcode;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring_withNoRepeatingCharacters() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    public void testLengthOfLongestSubstring_withAllUniqueCharacters() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("abcdefg");
        assertEquals(7, result);
    }

    @Test
    public void testLengthOfLongestSubstring_withEmptyString() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    @Test
    public void testLengthOfLongestSubstring_withSingleCharacter() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("a");
        assertEquals(1, result);
    }

    @Test
    public void testLengthOfLongestSubstring_withAllSameCharacters() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("aaaaa");
        assertEquals(1, result);
    }

    @Test
    public void testLengthOfLongestSubstring_withMultipleRepeatingCharacters() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void testLengthOfLongestSubstring_withSpecialCharacters() {
        LongestSubstringWithoutRepeatingCharacters3 obj = new LongestSubstringWithoutRepeatingCharacters3();
        int result = obj.lengthOfLongestSubstring("tmmzuxt");
        assertEquals(5, result);
    }
}
