package com.lossend.interview.code.leetcode.middle._0006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convert() {
        assertEquals("PAHNAPLSIIGYIR", new Solution().convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", new Solution().convert("PAYPALISHIRING",4));
        assertEquals("A", new Solution().convert("A", 1));
    }
}