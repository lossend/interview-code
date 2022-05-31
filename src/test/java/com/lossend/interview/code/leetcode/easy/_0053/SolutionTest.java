package com.lossend.interview.code.leetcode.easy._0053;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxSubArray() {
        assertEquals(1, new Solution().maxSubArray(new int[]{1}));
        assertEquals(6, new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}