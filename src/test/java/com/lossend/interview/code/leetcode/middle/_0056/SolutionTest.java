package com.lossend.interview.code.leetcode.middle._0056;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] r1 = {{1, 6}, {8,10}, {15, 18}};
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] r2 = {{1, 5}};
        assertArrayEquals(r1, new Solution().merge(intervals1));
        assertArrayEquals(r2, new Solution().merge(intervals2));
    }
}