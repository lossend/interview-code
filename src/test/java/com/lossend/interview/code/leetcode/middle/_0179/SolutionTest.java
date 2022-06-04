package com.lossend.interview.code.leetcode.middle._0179;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largestNumber() {
        assertEquals("0", new Solution().largestNumber(new int[] {0,0}));
        assertEquals("343234323", new Solution().largestNumber(new int[] {34323,3432}));
        assertEquals("9534330", new Solution().largestNumber(new int[] {3,30,34,5,9}));
        assertEquals("210", new Solution().largestNumber(new int[] {10,2}));
    }
}