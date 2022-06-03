package com.lossend.interview.code.leetcode.middle._0007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse() {
        assertEquals(0, new Solution().reverse(1534236469));
        assertEquals(321, new Solution().reverse(123));
        assertEquals(-321, new Solution().reverse(-123));
        assertEquals(21, new Solution().reverse(120));
    }
}