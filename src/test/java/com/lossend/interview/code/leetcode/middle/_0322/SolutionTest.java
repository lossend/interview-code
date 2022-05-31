package com.lossend.interview.code.leetcode.middle._0322;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void coinChange() {
        assertEquals(3, new Solution().coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, new Solution().coinChange(new int[]{2}, 3));
        assertEquals(0, new Solution().coinChange(new int[]{1}, 0));
    }
}