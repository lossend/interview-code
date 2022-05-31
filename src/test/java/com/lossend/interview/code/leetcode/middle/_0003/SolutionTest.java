package com.lossend.interview.code.leetcode.middle._0003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(2, new Solution().lengthOfLongestSubstring("abba"));
        assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, new Solution().lengthOfLongestSubstring("bbbbbb"));
        assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}