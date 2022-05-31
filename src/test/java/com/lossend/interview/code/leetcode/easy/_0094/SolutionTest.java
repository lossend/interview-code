package com.lossend.interview.code.leetcode.easy._0094;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void inorderTraversal() {
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode n1 = new TreeNode(1, null, n2);
        assertEquals(List.of(1, 3, 2), new Solution().inorderTraversal(n1));
    }
}