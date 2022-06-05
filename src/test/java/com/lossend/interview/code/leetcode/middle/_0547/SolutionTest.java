package com.lossend.interview.code.leetcode.middle._0547;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findCircleNum() {
        assertEquals(2, new Solution().findCircleNum(new int[][] {{1,1,0}, {1,1,0}, {0,0,1}}));
        assertEquals(3, new Solution().findCircleNum(new int[][] {{1,0,0}, {0,1,0}, {0,0,1}}));
        assertEquals(1, new Solution().findCircleNum(new int[][] {{1,0,0, 1}, {0,1, 1,0}, {0,1,1, 1}, {1, 0, 1, 1}}));
    }
}