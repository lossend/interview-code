package com.lossend.interview.code.leetcode.middle._0114;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void test() {
        TreeNode treeNode = TreeNode.buildTree(Arrays.asList(1, 2, 5, 3, 4, null, 6).toArray(new Integer[0]));
        new Solution().flatten(treeNode);
        assertArrayEquals(Arrays.asList(1, null, 2, null, 3, null, 4, null, 5, null, 6).toArray(new Integer[0]), TreeNode.toArray(treeNode));
    }
}