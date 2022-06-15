package com.lossend.interview.code.leetcode.middle._0309;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        assertEquals(6, new Solution().maxProfit(new int[] {6,1,3,2,4,7}));
        assertEquals(3, new Solution().maxProfit(new int[] {1,2,3,0,2}));
        assertEquals(0, new Solution().maxProfit(new int[] {1}));
    }
}