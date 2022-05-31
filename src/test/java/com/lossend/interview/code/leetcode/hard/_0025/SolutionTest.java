package com.lossend.interview.code.leetcode.hard._0025;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        ListNode l1 = ListNode.from(new int[]{1, 2, 3, 4, 5});
        ListNode l2 = ListNode.from(new int[]{1, 2, 3, 4, 5});
        assertEquals("[3,2,1,4,5]", ListNode.toString(new Solution().reverseKGroup(l1, 3)));
        assertEquals("[2,1,4,3,5]", ListNode.toString(new Solution().reverseKGroup(l2, 2)));
    }
}