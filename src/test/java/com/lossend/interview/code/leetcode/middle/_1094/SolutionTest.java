package com.lossend.interview.code.leetcode.middle._1094;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void test() {
        int[][] tips = {{2, 1, 5}, {3, 3, 7}};
        assertFalse(new Solution().carPooling(tips, 4));
        assertTrue(new Solution().carPooling(tips, 5));
    }
}