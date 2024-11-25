package com.hym.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome_EmptyString() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("");
        assertEquals("", result);
    }

    @Test
    public void testLongestPalindrome_SingleCharacter() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("a");
        assertEquals("a", result);
    }

    @Test
    public void testLongestPalindrome_NoPalindrome() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("abc");
        assertEquals("a", result);
    }

    @Test
    public void testLongestPalindrome_LongestPalindromeAtStart() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("abcba");
        assertEquals("abcba", result);
    }

    @Test
    public void testLongestPalindrome_LongestPalindromeInMiddle() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("abcbad");
        assertEquals("abcba", result);
    }

    @Test
    public void testLongestPalindrome_LongestPalindromeAtEnd() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("abcdcba");
        assertEquals("abcdcba", result);
    }

    @Test
    public void testLongestPalindrome_SinglePalindrome() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("aabbaa");
        assertEquals("aabbaa", result);
    }

    @Test
    public void testLongestPalindrome_MultiplePalindromes() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("abcdcbaaaa");
        assertEquals("abcdcba", result);
    }

    @Test
    public void testLongestPalindrome_AllSameCharacters() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("aaaaaaa");
        assertEquals("aaaaaaa", result);
    }

    @Test
    public void testLongestPalindrome_SpecialCharacters() {
        LongestPalindromicSubstring5 obj = new LongestPalindromicSubstring5();
        String result = obj.longestPalindrome("aabbaabba");
        assertEquals("abbaabba", result);
    }

}