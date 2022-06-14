package com.lossend.interview.code.leetcode.middle._0143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reorderList() {
        ListNode l1 = ListNode.from(new int[] {1,2,3,4});
        new Solution().reorderList(l1);
        assertEquals("[1,4,2,3]", ListNode.toString(l1));
        ListNode l2 = ListNode.from(new int[] {1,2,3,4, 5});
        new Solution().reorderList(l2);
        assertEquals("[1,5,2,4,3]", ListNode.toString(l2));
    }
}