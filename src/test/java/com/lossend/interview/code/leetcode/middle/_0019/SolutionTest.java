package com.lossend.interview.code.leetcode.middle._0019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeNthFromEnd() {
        assertEquals("[1,2,3,5]", ListNode.toString(new Solution().removeNthFromEnd(ListNode.from(new int[]{1, 2, 3, 4, 5}), 2)));
        assertEquals("[]", ListNode.toString(new Solution().removeNthFromEnd(ListNode.from(new int[]{1}), 1)));
        assertEquals("[1]", ListNode.toString(new Solution().removeNthFromEnd(ListNode.from(new int[]{1, 2}), 1)));
    }
}