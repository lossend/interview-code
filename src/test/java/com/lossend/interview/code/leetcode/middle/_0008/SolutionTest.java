package com.lossend.interview.code.leetcode.middle._0008;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void myAtoi() {
        assertEquals(42, new Solution().myAtoi("42"));
        assertEquals(-42, new Solution().myAtoi("     -42"));
    }
}