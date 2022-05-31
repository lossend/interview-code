package com.lossend.interview.code.leetcode.easy._0461;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void hammingDistance() {
        assertEquals(2, new Solution().hammingDistance(1, 4));
        assertEquals(1, new Solution().hammingDistance(3, 1));
    }
}