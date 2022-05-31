package com.lossend.interview.code.leetcode.middle._889;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void constructFromPrePost() {
        TreeNode t3 = new Solution().constructFromPrePost(new int[]{1, 2}, new int[]{2, 1});
        assertArrayEquals(Arrays.asList(1, 2).toArray(new Integer[0]), TreeNode.toArray(t3));
        TreeNode t1 = new Solution().constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1});
        assertArrayEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7).toArray(new Integer[0]), TreeNode.toArray(t1));
        TreeNode t2 = new Solution().constructFromPrePost(new int[]{-1}, new int[]{-1});
        assertArrayEquals(Arrays.asList(-1).toArray(new Integer[0]), TreeNode.toArray(t2));
    }
}