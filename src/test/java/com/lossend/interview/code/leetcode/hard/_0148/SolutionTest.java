package com.lossend.interview.code.leetcode.hard._0148;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void sortList() {
        assertEquals("[1,2,3,4]", ListNode.toString(new Solution().sortList(ListNode.from(new int[]{4, 2, 1, 3}))));
        assertEquals("[-1,0,3,4,5]", ListNode.toString(new Solution().sortList(ListNode.from(new int[]{-1, 0, 3, 4, 5}))));
        assertEquals("[]", ListNode.toString(new Solution().sortList(ListNode.from(new int[]{}))));
    }
}