package com.lossend.interview.code.leetcode.middle._0394;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decodeString() {
        assertEquals("accaccacc", new Solution().decodeString("3[a2[c]]"));
        assertEquals("aaabcbc", new Solution().decodeString("3[a]2[bc]"));
        assertEquals("abcabccdcdcdef", new Solution().decodeString("2[abc]3[cd]ef"));
        assertEquals("abccdcdcdxyz", new Solution().decodeString("abc3[cd]xyz"));
    }
}