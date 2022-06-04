package com.lossend.interview.code.leetcode.middle._0054;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void spiralOrder() {
        assertEquals(List.of(1,2,3,6,9,8,7,4,5), new Solution().spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        assertEquals(List.of(1,2,3,4,8,12,11,10,9,5,6,7), new Solution().spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}