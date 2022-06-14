package com.lossend.interview.code.leetcode.middle._0024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void swapPairs() {
        assertEquals("[2,1,4,3]", ListNode.toString(new Solution().swapPairs(ListNode.from(new int[] {1, 2, 3,4}))));
        assertEquals("[2,1,4,3,5]", ListNode.toString(new Solution().swapPairs(ListNode.from(new int[] {1, 2, 3,4,5}))));
    }
}