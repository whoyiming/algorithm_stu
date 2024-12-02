package com.hym.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testIntToRoman() {
        IntegerToRoman12 converter = new IntegerToRoman12();
    
        // Test case: 1
        assertEquals("I", converter.intToRoman(1));
    
        // Test case: 4
        assertEquals("IV", converter.intToRoman(4));
    
        // Test case: 5
        assertEquals("V", converter.intToRoman(5));
    
        // Test case: 9
        assertEquals("IX", converter.intToRoman(9));
    
        // Test case: 10
        assertEquals("X", converter.intToRoman(10));
    
        // Test case: 40
        assertEquals("XL", converter.intToRoman(40));
    
        // Test case: 50
        assertEquals("L", converter.intToRoman(50));
    
        // Test case: 90
        assertEquals("XC", converter.intToRoman(90));
    
        // Test case: 100
        assertEquals("C", converter.intToRoman(100));
    
        // Test case: 400
        assertEquals("CD", converter.intToRoman(400));
    
        // Test case: 500
        assertEquals("D", converter.intToRoman(500));
    
        // Test case: 900
        assertEquals("CM", converter.intToRoman(900));
    
        // Test case: 1000
        assertEquals("M", converter.intToRoman(1000));
    
        // Test case: 3999
        assertEquals("MMMCMXCIX", converter.intToRoman(3999));
    
        // Test case: 3499
        assertEquals("MMMCDXCIX", converter.intToRoman(3499));
    
        // Test case: 1990
        assertEquals("MCMXC", converter.intToRoman(1990));

        // Additional test cases for edge cases
        assertEquals("III", converter.intToRoman(3));
        assertEquals("VIII", converter.intToRoman(8));
        assertEquals("XIII", converter.intToRoman(13));
        assertEquals("XVIII", converter.intToRoman(18));
        assertEquals("XLIII", converter.intToRoman(43));
        assertEquals("LIII", converter.intToRoman(53));
        assertEquals("LXIII", converter.intToRoman(63));
        assertEquals("LXXIII", converter.intToRoman(73));
    }

}