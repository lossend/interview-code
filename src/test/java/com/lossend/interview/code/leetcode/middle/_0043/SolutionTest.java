package com.lossend.interview.code.leetcode.middle._0043;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void multiply() {
        assertEquals("0", new Solution().multiply("0", "0"));
        assertEquals("56088", new Solution().multiply("123", "456"));
        assertEquals("6", new Solution().multiply("2", "3"));
    }
}