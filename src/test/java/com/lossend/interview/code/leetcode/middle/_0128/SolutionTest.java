package com.lossend.interview.code.leetcode.middle._0128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestConsecutive() {
        assertEquals(4, new Solution().longestConsecutive(new int[] {100,4,200,1,3,2}));
        assertEquals(2, new Solution().longestConsecutive(new int[] {0,0,-1}));
        assertEquals(9, new Solution().longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
    }
}