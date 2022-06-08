package com.lossend.interview.code.leetcode.middle._0151;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseWords() {
        assertEquals("example good a", new Solution().reverseWords("a good   example"));
    }
}