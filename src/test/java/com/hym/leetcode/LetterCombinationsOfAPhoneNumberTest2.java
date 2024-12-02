package com.hym.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LetterCombinationsOfAPhoneNumberTest2 {

    @Test
    public void testLeterCombinationsWithAllValidDigits() {
        LetterCombinationsOfAPhoneNumber17 sol = new LetterCombinationsOfAPhoneNumber17();
        List<String> result = sol.letterCombinations("234");
        List<String> expected = Arrays.asList(
            "adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi",
            "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi",
            "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"
        );
        assertEquals(expected, result);
    }

    @Test
    public void testLetterCombinationsWithValidInput() {
        LetterCombinationsOfAPhoneNumber17 sol = new LetterCombinationsOfAPhoneNumber17();
        List<String> result = sol.letterCombinations("23");
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, result);
    }

    @Test
    public void testLetterCombinationsWithEmptyInput() {
        LetterCombinationsOfAPhoneNumber17 sol = new LetterCombinationsOfAPhoneNumber17();
        List<String> result = sol.letterCombinations("");
        assertEquals(0, result.size());
    }

    @Test
    public void testLetterCombinationsWithNullInput() {
        LetterCombinationsOfAPhoneNumber17 sol = new LetterCombinationsOfAPhoneNumber17();
        List<String> result = sol.letterCombinations(null);
        assertEquals(0, result.size());
    }

    @Test
    public void testLeterCombinationsWithSingleDigit() {
        LetterCombinationsOfAPhoneNumber17 sol = new LetterCombinationsOfAPhoneNumber17();
        List<String> result = sol.letterCombinations("2");
        List<String> expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, result);
    }


}