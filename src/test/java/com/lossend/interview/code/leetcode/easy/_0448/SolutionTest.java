package com.lossend.interview.code.leetcode.easy._0448;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        assertEquals(List.of(5, 6), new Solution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        assertEquals(List.of(2), new Solution().findDisappearedNumbers(new int[]{1, 1}));
    }
}