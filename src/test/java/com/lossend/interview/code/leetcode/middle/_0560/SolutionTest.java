package com.lossend.interview.code.leetcode.middle._0560;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void subarraySum() {
        assertEquals(3, new Solution().subarraySum(new int[] {1, -1, 0}, 0));
        assertEquals(2, new Solution().subarraySum(new int[] {1, 1, 1}, 2));
        assertEquals(2, new Solution().subarraySum(new int[] {1, 2, 3}, 3));
    }
}