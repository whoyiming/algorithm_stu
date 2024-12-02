package com.hym.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void testMyAtoiTrailingWhitespace() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(123, converter.myAtoi("123  "));
    }

    @Test
    public void testMyAtoiLeadingAndTrailingWhitespace() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(123, converter.myAtoi("  123  "));
    }

    @Test
    public void testMyAtoiIntegerOverflow() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(Integer.MAX_VALUE, converter.myAtoi(String.valueOf((long)Integer.MAX_VALUE + 1)));
    }

    @Test
    public void testMyAtoiIntegerUnderflow() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(Integer.MIN_VALUE, converter.myAtoi(String.valueOf((long)Integer.MIN_VALUE - 1)));
    }

    @Test
    public void testMyAtoiWhitespaceInMiddle() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(123, converter.myAtoi("123abc"));
    }

    @Test
    public void testMyAtoiEmptyString() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(0, converter.myAtoi(""));
    }

    @Test
    public void testMyAtoiIntegerMin() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(Integer.MIN_VALUE, converter.myAtoi(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    public void testMyAtoiNegativeInteger() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(-123, converter.myAtoi("-123"));
    }

    @Test
    public void testMyAtoiIntegerMax() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(Integer.MAX_VALUE, converter.myAtoi(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testMyAtoiLeadingAndTrailingAlpha() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(0, converter.myAtoi("abc 123 def"));
    }

    @Test
    public void testMyAtoiLeadingAlpha() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(0, converter.myAtoi("abc123"));
    }

    @Test
    public void testMyAtoiNormalInteger() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(123, converter.myAtoi("123"));
    }

    @Test
    public void testMyAtoiPositiveIntegerWithLeadingPlus() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(123, converter.myAtoi("+123"));
    }

    @Test
    public void testMyAtoiLeadingWhitespace() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(123, converter.myAtoi("  123"));
    }

    @Test
    public void testMyAtoiLeadingWhitespaceAndZeroNegative() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(-123, converter.myAtoi("  -0123"));
    }

    @Test
    public void testMyAtoiIntegerOverflowBig() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(Integer.MAX_VALUE, converter.myAtoi("20000000000000000000"));
    }


    @Test
    public void testMyAtoiIntegerLeadingWhitespaceAndZero() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(12345678, converter.myAtoi( "  0000000000012345678"));
    }

    @Test
    public void testMyAtoiIntegerNumberChars() {
        StringToInteger8 converter = new StringToInteger8();
        assertEquals(0, converter.myAtoi( "0-1"));
    }


}