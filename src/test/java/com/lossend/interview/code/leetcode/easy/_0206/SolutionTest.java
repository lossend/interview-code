package com.lossend.interview.code.leetcode.easy._0206;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverseList() {
        new ListNodeAssert(new Solution().reverseList(ListNode.from(new int[]{1, 2, 3, 4, 5})))
                .isEqualTo(ListNode.from(new int[]{5, 4, 3, 2, 1}));
    }
}