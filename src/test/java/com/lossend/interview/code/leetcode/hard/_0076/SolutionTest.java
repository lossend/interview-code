package com.lossend.interview.code.leetcode.hard._0076;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void minWindow() {
        assertEquals("BANC", new Solution().minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("a", new Solution().minWindow("a", "a"));
        assertEquals("", new Solution().minWindow("a", "aa"));
    }
}