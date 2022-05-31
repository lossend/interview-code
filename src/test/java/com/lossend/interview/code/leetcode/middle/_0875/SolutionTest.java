package com.lossend.interview.code.leetcode.middle._0875;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void minEatingSpeed() {
        assertEquals(4, new Solution().minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(30, new Solution().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        assertEquals(23, new Solution().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
        assertEquals(2, new Solution().minEatingSpeed(new int[]{312884470}, 312884469));
    }
}