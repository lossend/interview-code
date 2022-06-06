package com.lossend.interview.code.leetcode.middle._0048;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rotate() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] r = {{7,4,1},{8,5,2},{9,6,3}};
        new Solution().rotate(m);
        assertArrayEquals(r, m);
    }
}