package com.lossend.interview.code.leetcode.middle._0022;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testGenerateParenthesis() {
        assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), new Solution().generateParenthesis(3));
        assertEquals(List.of("(())", "()()"), new Solution().generateParenthesis(2));
        assertEquals(List.of("()"), new Solution().generateParenthesis(1));
    }
}