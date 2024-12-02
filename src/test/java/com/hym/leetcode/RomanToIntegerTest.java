package com.hym.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {
        RomanToInteger13 converter = new RomanToInteger13();
    
        // Test case 1: Simple case
        assertEquals(3, converter.romanToInt("III"));
    
        // Test case 2: Subtraction case
        assertEquals(4, converter.romanToInt("IV"));
    
        // Test case 3: Complex case
        assertEquals(9, converter.romanToInt("IX"));
    
        // Test case 4: Complex case with multiple digits
        assertEquals(58, converter.romanToInt("LVIII"));
    
        // Test case 5: Case with 'D'
        assertEquals(500, converter.romanToInt("D"));
    
        // Test case 6: Case with 'M'
        assertEquals(1000, converter.romanToInt("M"));
    
        // Test case 7: Case with 'CM'
        assertEquals(900, converter.romanToInt("CM"));
    
        // Test case 8: Case with 'CD'
        assertEquals(400, converter.romanToInt("CD"));
    
        // Test case 9: Case with 'XC'
        assertEquals(90, converter.romanToInt("XC"));
    
        // Test case 10: Case with 'XL'
        assertEquals(40, converter.romanToInt("XL"));
    
        // Test case 11: Case with 'IV'
        assertEquals(4, converter.romanToInt("IV"));
    
        // Test case 12: Case with 'IX'
        assertEquals(9, converter.romanToInt("IX"));
    
        // Test case 13: Case with 'VIII'
        assertEquals(8, converter.romanToInt("VIII"));
    
        // Test case 14: Case with 'XXIV'
        assertEquals(24, converter.romanToInt("XXIV"));
    
        // Test case 15: Case with 'LXXXVIII'
        assertEquals(88, converter.romanToInt("LXXXVIII"));
    
        // Test case 16: Case with 'CXLIV'
        assertEquals(144, converter.romanToInt("CXLIV"));
    
        // Test case 17: Case with 'MCMLXXXIV'
        assertEquals(1984, converter.romanToInt("MCMLXXXIV"));
    }

}