package com.lossend.interview.code.leetcode.easy._0226;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void invertTree() {
        TreeNode expect = TreeNode.buildTree(IntStream.of(4, 7, 2, 9, 6, 3, 1).boxed().toArray(Integer[]::new));
        TreeNode actual = TreeNode.buildTree(IntStream.of(4, 2, 7, 1, 3, 6, 9).boxed().toArray(Integer[]::new));
        assertEquals(TreeNode.toString(expect), TreeNode.toString(new Solution().invertTree(actual)));
    }
}