package com.hym.leetcode;

import com.hym.leetcode.ValidPalindrome125;
import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void test1() {
        String s = "A man, a plan, a canal: Panama";
        Assert.assertEquals(true, ValidPalindrome125.isPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "race a car";
        Assert.assertEquals(false, ValidPalindrome125.isPalindrome(s));
    }

    @Test
    public void test3() {
        String s = " ";
        Assert.assertEquals(false, ValidPalindrome125.isPalindrome(s));
    }
}
