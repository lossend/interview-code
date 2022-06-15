package com.lossend.interview.code.leetcode.middle._0139;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wordBreak() {
        assertEquals(true, new Solution().wordBreak("applepenapple", List.of("apple", "pen")));
        assertEquals(false, new Solution().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
        assertEquals(true, new Solution().wordBreak("leetcode", List.of("leet", "code")));
    }
}