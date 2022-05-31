package com.lossend.interview.code.leetcode.easy._0003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(new Solution().lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(new Solution().lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(new Solution().lengthOfLongestSubstring("pwwkew"), 3);
    }
}