package com.lossend.interview.code.leetcode.easy._0136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        assertEquals(1, new Solution().singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, new Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, new Solution().singleNumber(new int[]{1}));
    }
}