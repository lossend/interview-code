package com.lossend.interview.code.leetcode.middle._1190;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseParentheses() {
        assertEquals("dcba", new Solution().reverseParentheses("(abcd)"));
        assertEquals("iloveu", new Solution().reverseParentheses("(u(love)i)"));
        assertEquals("leetcode", new Solution().reverseParentheses("(ed(et(oc))el)"));
    }

}