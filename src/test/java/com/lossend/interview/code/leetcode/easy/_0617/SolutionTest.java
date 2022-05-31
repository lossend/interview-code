package com.lossend.interview.code.leetcode.easy._0617;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testMerge() {
        TreeNode root1 = TreeNode.buildTree(Stream.of(1, 3, 2, 5).toArray(Integer[]::new));
        TreeNode root2 = TreeNode.buildTree(Stream.of(2, 1, 3, null, 4, null, 7).toArray(Integer[]::new));
        TreeNode actual = new Solution().mergeTrees(root1, root2);
        assertArrayEquals(Stream.of(3, 4, 5, 5, 4, null, 7).toArray(Integer[]::new), TreeNode.toArray(actual));
    }
}