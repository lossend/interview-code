package com.lossend.interview.code.leetcode.middle._0300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLIS() {
        assertEquals(4, new Solution().lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
    }
}