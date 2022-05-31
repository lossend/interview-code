package com.lossend.interview.code.leetcode.easy._0141;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void test() {
        assertTrue(new Solution().hasCycle(ListNode.cycleList(new int[]{3, 2, 0, -4}, 1)));
        assertTrue(new Solution().hasCycle(ListNode.cycleList(new int[]{1, 2}, 0)));
        assertFalse(new Solution().hasCycle(ListNode.cycleList(new int[]{1}, -1)));
        assertFalse(new Solution().hasCycle(ListNode.cycleList(new int[]{1, 2}, -1)));
    }
}