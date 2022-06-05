package com.lossend.interview.code.leetcode.middle._0062;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniquePaths() {
        assertEquals(28, new Solution().uniquePaths(3, 7));
        assertEquals(28, new Solution().uniquePaths(7, 3));
        assertEquals(3, new Solution().uniquePaths(3,2));
        assertEquals(6, new Solution().uniquePaths(3,3));
    }
}