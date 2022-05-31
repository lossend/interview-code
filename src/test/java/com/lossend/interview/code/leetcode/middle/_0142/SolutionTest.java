package com.lossend.interview.code.leetcode.middle._0142;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void detectCycle() {
        ListNode l1 = ListNode.cycleList(new int[]{3, 2, 0, 4}, 1);
        ListNode l2 = ListNode.cycleList(new int[]{1, 2}, 0);
        ListNode l3 = ListNode.cycleList(new int[]{1}, -1);
        assertEquals(l1.indexOf(1), new Solution().detectCycle(l1));
        assertEquals(l2.indexOf(0), new Solution().detectCycle(l2));
        assertEquals(null, new Solution().detectCycle(l3));
    }
}