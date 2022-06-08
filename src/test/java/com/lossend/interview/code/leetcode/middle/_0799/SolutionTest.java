package com.lossend.interview.code.leetcode.middle._0799;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void champagneTower() {
        assertEquals(0.1875, new Solution().champagneTower(25, 6, 1));
        assertEquals(1.0, new Solution().champagneTower(100000009, 33, 17));
        assertEquals(0.5, new Solution().champagneTower(2, 1, 1));
        assertEquals(0.0, new Solution().champagneTower(1, 1, 1));
    }
}