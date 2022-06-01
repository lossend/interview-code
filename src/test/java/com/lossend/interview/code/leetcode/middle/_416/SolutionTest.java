package com.lossend.interview.code.leetcode.middle._416;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canPartition() {
        assertEquals(false, new Solution().canPartition(new int[] {1,2,5}));
        assertEquals(true, new Solution().canPartition(new int[] {1,5,11,5}));
        assertEquals(false, new Solution().canPartition(new int[] {1,2,3,5}));
    }
}