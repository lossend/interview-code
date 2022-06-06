package com.lossend.interview.code.leetcode.middle._0207;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canFinish() {
        assertEquals(true, new Solution().canFinish(8, new int[][] {{1,0},{2,6},{1,7},{6,4},{7,0},{0,5}}));
        assertEquals(true, new Solution().canFinish(2, new int[][] {{1, 0}}));
        assertEquals(false, new Solution().canFinish(2, new int[][] {{1, 0}, {0, 1}}));
        assertEquals(true, new Solution().canFinish(5, new int[][] {{1,4},{2,4},{3,1},{3,2}}));
    }
}