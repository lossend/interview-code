package com.lossend.interview.code.leetcode.middle._0438;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void findAnagrams() {
        //assertEquals(List.of(0, 1, 2), new Solution().findAnagrams("abab", "ab"));
        assertEquals(List.of(0, 6), new Solution().findAnagrams("cbaebabacd", "abc"));
    }
}