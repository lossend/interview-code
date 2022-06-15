package com.lossend.interview.code.leetcode.middle._0347;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void topKFrequent() {
        assertArrayEquals(new int[] {1, 2}, new Solution().topKFrequent(new int[] {1,1,1,2,2,3}, 2));
    }
}