package com.lossend.interview.code.leetcode.middle._0654;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void constructMaximumBinaryTree() {
        TreeNode t = new Solution().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        assertArrayEquals(Arrays.asList(6, 3, 5, null, 2, 0, null, null, 1).toArray(new Integer[0]), TreeNode.toArray(t));
        TreeNode t2 = new Solution().constructMaximumBinaryTree(new int[]{3, 2, 1});
        assertArrayEquals(Arrays.asList(3, null, 2, null, 1).toArray(new Integer[0]), TreeNode.toArray(t2));
    }
}