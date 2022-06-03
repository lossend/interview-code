package com.lossend.interview.code.leetcode.middle._0789;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numRabbits() {
        assertEquals(5, new Solution().numRabbits(new int[] {1,1,2}));
        assertEquals(11, new Solution().numRabbits(new int[] {10, 10, 10}));
    }
}