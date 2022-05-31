package com.lossend.interview.code.leetcode.easy._0104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxDepth() {
        assertEquals(3, new Solution().maxDepth(TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
        assertEquals(2, new Solution().maxDepth(TreeNode.buildTree(new Integer[]{1, null, 2})));
    }
}