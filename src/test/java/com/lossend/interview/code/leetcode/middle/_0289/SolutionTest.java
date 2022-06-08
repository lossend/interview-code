package com.lossend.interview.code.leetcode.middle._0289;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void gameOfLife() {
        int[][] m2 = {{1,1},{1,0}};
        int[][] r2 = {{1, 1}, {1, 1}};
        new Solution().gameOfLife(m2);
        assertArrayEquals(r2, m2);
        int[][] m1 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] r1 = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        new Solution().gameOfLife(m1);
        assertArrayEquals(r1, m1);
    }
}