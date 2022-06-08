package com.lossend.interview.code.leetcode.middle._0039;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void combinationSum() {
        assertEquals(List.of(List.of(2,2,3), List.of(7)), new Solution().combinationSum(new int[] {2,3,6,7}, 7));
    }
}