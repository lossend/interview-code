package com.lossend.interview.code._0221;

import com.lossend.interview.code.leetcode.middle._0221.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximalSquare() {
        char[][] m1 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char[][] m2 = {{'0','1'},{'1','0'}};
        char[][] m3 = {{'0'}};
        assertEquals(4, new Solution().maximalSquare(m1));
        assertEquals(1, new Solution().maximalSquare(m2));
        assertEquals(0, new Solution().maximalSquare(m3));
    }
}