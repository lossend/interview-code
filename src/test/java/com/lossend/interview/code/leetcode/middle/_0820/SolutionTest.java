package com.lossend.interview.code.leetcode.middle._0820;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minimumLengthEncoding() {
        assertEquals(10, new Solution().minimumLengthEncoding(new String[]{"time", "me", "bell"}));
        assertEquals(2, new Solution().minimumLengthEncoding(new String[]{"t"}));
    }
}