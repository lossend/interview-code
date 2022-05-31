package com.lossend.interview.code.leetcode.middle._0105;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void buildTree() {
        TreeNode t1 = new Solution().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertArrayEquals(Arrays.asList(3, 9, 20, null, null, 15, 7).toArray(new Integer[0]), TreeNode.toArray(t1));
        TreeNode t2 = new Solution().buildTree(new int[]{-1}, new int[]{-1});
        assertArrayEquals(Arrays.asList(-1).toArray(new Integer[0]), TreeNode.toArray(t2));
    }
}