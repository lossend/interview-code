package com.lossend.interview.code.leetcode.easy._0169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void majorityElement() {
        assertEquals(3, new Solution().majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}