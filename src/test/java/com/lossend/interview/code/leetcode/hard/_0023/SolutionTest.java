package com.lossend.interview.code.leetcode.hard._0023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void mergeKLists() {
        ListNode[] lists = new ListNode[]{ListNode.from(new int[]{1, 4, 5}), ListNode.from(new int[]{1, 3, 4}), ListNode.from(new int[]{2, 6})};
        assertEquals("[1,1,2,3,4,4,5,6]", ListNode.toString(new Solution().mergeKLists(lists)));
    }
}