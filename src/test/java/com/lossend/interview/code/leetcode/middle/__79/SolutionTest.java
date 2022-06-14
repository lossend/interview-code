package com.lossend.interview.code.leetcode.middle.__79;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void exist() {
        char[][] matrix = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        assertEquals(true,new Solution().exist(matrix, "ABCCED"));
        assertEquals(false,new Solution().exist(matrix, "ABCB"));
    }
}