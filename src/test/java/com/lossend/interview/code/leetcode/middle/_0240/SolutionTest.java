package com.lossend.interview.code.leetcode.middle._0240;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchMatrix() {
        int[][] m = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] m2 = {{5}, {6}};
        int[][] m3 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        assertEquals(true, new Solution().searchMatrix(m3, 19));
        assertEquals(true, new Solution().searchMatrix(m2, 6));
        assertEquals(true, new Solution().searchMatrix(m, 5));
        assertEquals(false, new Solution().searchMatrix(m, 20));
    }
}