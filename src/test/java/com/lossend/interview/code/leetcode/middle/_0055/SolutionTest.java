package com.lossend.interview.code.leetcode.middle._0055;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canJump() {
        assertEquals(true, new Solution().canJump(new int[] {2,3,1,1,4}));
        assertEquals(false, new Solution().canJump(new int[] {3,2,1,0,4}));
    }
}