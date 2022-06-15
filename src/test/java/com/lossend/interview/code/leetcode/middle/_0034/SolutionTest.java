package com.lossend.interview.code.leetcode.middle._0034;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchRange() {
        assertArrayEquals(new int[] {5, 5}, new Solution().searchRange(new int[] {5,7,7,8,8,10}, 10));
        assertArrayEquals(new int[] {3, 4}, new Solution().searchRange(new int[] {5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[] {-1, -1}, new Solution().searchRange(new int[] {5,7,7,8,8,10}, 6));
    }
}