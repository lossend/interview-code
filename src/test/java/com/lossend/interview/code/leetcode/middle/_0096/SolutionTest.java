package com.lossend.interview.code.leetcode.middle._0096;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numTrees() {
        assertEquals(5, new Solution().numTrees(3));
        assertEquals(1, new Solution().numTrees(1));
    }
}