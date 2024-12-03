package com.hym.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigzagConversionTest {

    @Test
    public void testConvertEmptyString() {
        ZigzagConversion6 converter = new ZigzagConversion6();
        assertEquals("", converter.convert("", 3));
    }

    @Test
    public void testConvertFourRows() {
        ZigzagConversion6 converter = new ZigzagConversion6();
        assertEquals("PINALSIGYAHRPI", converter.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void testConvertOneRow() {
        ZigzagConversion6 converter = new ZigzagConversion6();
        assertEquals("ABC", converter.convert("ABC", 1));
    }


    @Test
    public void testConvertSingleRow() {
        ZigzagConversion6 converter = new ZigzagConversion6();
        assertEquals("PAYPALISHIRING", converter.convert("PAYPALISHIRING", 1));
    }


    @Test
    public void testConvertThreeRows() {
        ZigzagConversion6 converter = new ZigzagConversion6();
        assertEquals("PAHNAPLSIIGYIR", converter.convert("PAYPALISHIRING", 3));
    }


}