package com.lossend.interview.code.leetcode.middle._406;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reconstructQueue() {
        int[][] p1 = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] r1 = {{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}};
        assertArrayEquals(r1, new Solution().reconstructQueue(p1));
        int[][] p2 ={{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        int[][] r2 = {{4,0},{5,0},{2,2},{3,2},{1,4},{6,0}};
        assertArrayEquals(r2, new Solution().reconstructQueue(p2));
    }
}