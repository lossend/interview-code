package com.lossend.interview.code.leetcode.middle._0475;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findRadius() {
        assertEquals(3, new Solution().findRadius(new int[]{1,5}, new int[]{2}));
        assertEquals(1, new Solution().findRadius(new int[]{1,2,3}, new int[]{2}));
        assertEquals(1, new Solution().findRadius(new int[]{1,2,3, 4}, new int[]{1, 4}));
    }
}