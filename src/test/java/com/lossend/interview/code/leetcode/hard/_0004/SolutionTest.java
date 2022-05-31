package com.lossend.interview.code.leetcode.hard._0004;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        assertEquals(2, new Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, new Solution().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(1, new Solution().findMedianSortedArrays(new int[]{}, new int[]{1}));
    }
}