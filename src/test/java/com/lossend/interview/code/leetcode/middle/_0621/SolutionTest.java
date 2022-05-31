package com.lossend.interview.code.leetcode.middle._0621;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void leastInterval() {
        assertEquals(16, new Solution().leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2));
        assertEquals(6, new Solution().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
        assertEquals(8, new Solution().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }
}