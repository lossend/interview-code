package com.lossend.interview.code.leetcode.middle._0017;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void letterCombinations() {
        assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), new Solution().letterCombinations("23"));
        assertIterableEquals(List.of(), new Solution().letterCombinations(""));
        assertEquals(List.of("a","b","c"), new Solution().letterCombinations("2"));
    }
}