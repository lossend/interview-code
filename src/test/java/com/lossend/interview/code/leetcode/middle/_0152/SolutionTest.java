package com.lossend.interview.code.leetcode.middle._0152;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProduct() {
        assertEquals(6, new Solution().maxProduct(new int[] {1, -2, -3, -1}));
        assertEquals(6, new Solution().maxProduct(new int[] {2, 3, -2, 4}));
        assertEquals(0, new Solution().maxProduct(new int[] {-2, 0, -1}));
    }
}