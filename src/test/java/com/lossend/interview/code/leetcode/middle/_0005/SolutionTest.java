package com.lossend.interview.code.leetcode.middle._0005;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void longestPalindrome() {
        assertEquals("bab", new Solution().longestPalindrome("babad"));
        assertEquals("bb", new Solution().longestPalindrome("cbbd"));
    }
}