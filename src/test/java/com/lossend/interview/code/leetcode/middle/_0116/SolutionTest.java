package com.lossend.interview.code.leetcode.middle._0116;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    @Test
    void test() {
        new Solution().connect(Node.buildTree(List.of(1, 2, 3, 4, 5, 6, 7).toArray(new Integer[0])));
    }
}