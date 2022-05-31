package com.lossend.interview.code.leetcode.easy._0160;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testGetIntersectionNode() {
        ListNode common = ListNode.from(new int[]{8, 4, 5});
        ListNode headA = ListNode.createConcat(new int[]{4, 1}, common);
        ListNode headB = ListNode.createConcat(new int[]{5, 6, 1}, common);
        new ListNodeAssert(new Solution().getIntersectionNode(headA, headB)).isEqualTo(common);
    }
}