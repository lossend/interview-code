package com.lossend.interview.code.leetcode.easy._0283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void test() {
        int[] a = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(a);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, a);
        int[] b = new int[]{0};
        new Solution().moveZeroes(b);
        assertArrayEquals(new int[]{0}, b);
    }
}