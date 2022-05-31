package com.lossend.interview.code.leetcode.middle._0134;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void canCompleteCircuit() {
        assertEquals(3, new Solution().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        assertEquals(-1, new Solution().canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}