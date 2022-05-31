package com.lossend.interview.code.leetcode.easy._0234;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPalindrome() {
        assertTrue(new Solution().isPalindrome(ListNode.from(new int[]{1})));
        assertTrue(new Solution().isPalindrome(ListNode.from(new int[]{1, 2, 2, 1})));
        assertTrue(new Solution().isPalindrome(ListNode.from(new int[]{1, 2, 3, 2, 1})));
        assertFalse(new Solution().isPalindrome(ListNode.from(new int[]{1, 2})));
    }
}