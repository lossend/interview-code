package com.lossend.interview.code.leetcode.middle._0011;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testMaxArea() {
        assertEquals(49, new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        assertEquals(1, new Solution().maxArea(new int[]{1, 1}));
    }
}