package com.lossend.interview.code.leetcode.middle._0122;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        assertEquals(7, new Solution().maxProfit(new int[] {3,2,6,5,0,3}));
        assertEquals(7, new Solution().maxProfit(new int[] {7,1,5,3,6,4}));
        assertEquals(4, new Solution().maxProfit(new int[] {1,2,3,4,5}));
        assertEquals(0, new Solution().maxProfit(new int[] {7,6,4,3,1}));
    }
}