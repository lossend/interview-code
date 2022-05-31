package com.lossend.interview.code.leetcode.middle._0015;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void threeSum() {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of(-1, -1, 2));
        expect.add(List.of(-1, 0, 1));
        assertEquals(expect, new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(new ArrayList<>(), new Solution().threeSum(new int[]{}));
        assertEquals(new ArrayList<>(), new Solution().threeSum(new int[]{0}));
    }
}