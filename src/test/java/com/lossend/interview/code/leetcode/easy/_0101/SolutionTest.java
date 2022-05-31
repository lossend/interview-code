package com.lossend.interview.code.leetcode.easy._0101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void testIsSymmetric() {
        TreeNode tree1 = TreeNode.buildTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        TreeNode tree2 = TreeNode.buildTree(new Integer[]{1, 2, 2, null, 3, null, 3});
        assertTrue(new Solution().isSymmetric(tree1));
        assertFalse(new Solution().isSymmetric(tree2));
    }
}
