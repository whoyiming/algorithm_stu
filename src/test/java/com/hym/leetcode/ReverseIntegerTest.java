package com.hym.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {
        ReverseInteger7 reverseInteger7 = new ReverseInteger7();
    
        // Test case 1: Normal reverse
        assertEquals(321, reverseInteger7.reverse(123));
    
        // Test case 2: Negative number reverse
        assertEquals(-321, reverseInteger7.reverse(-123));
    
        // Test case 3: Leading zeros
        assertEquals(123, reverseInteger7.reverse(32100));
    
        // Test case 4: Single digit
        assertEquals(5, reverseInteger7.reverse(5));
    
        // Test case 5: Zero
        assertEquals(0, reverseInteger7.reverse(0));
    
        // Test case 6: Overflow example (Integer.MAX_VALUE + 1)
        assertEquals(0, reverseInteger7.reverse(Integer.MAX_VALUE + 1));
    
        // Test case 7: Overflow example (Integer.MIN_VALUE - 1)
        assertEquals(0, reverseInteger7.reverse(Integer.MIN_VALUE - 1));
    
        // Test case 8: Edge case (Integer.MIN_VALUE)
        assertEquals(0, reverseInteger7.reverse(Integer.MIN_VALUE));
    
        // Test case 9: Edge case (Integer.MAX_VALUE)
        assertEquals(0, reverseInteger7.reverse(Integer.MAX_VALUE));
    }

}