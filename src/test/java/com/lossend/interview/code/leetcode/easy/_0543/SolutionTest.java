package com.lossend.interview.code.leetcode.easy._0543;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        assertEquals(3, new Solution().diameterOfBinaryTree(TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5})));
        assertEquals(1, new Solution().diameterOfBinaryTree(TreeNode.buildTree(new Integer[]{1, 2})));
    }
}