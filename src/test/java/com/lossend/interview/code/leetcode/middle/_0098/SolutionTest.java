package com.lossend.interview.code.leetcode.middle._0098;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValidBST() {
        assertEquals(true, new Solution().isValidBST(TreeNode.buildTree(List.of(2, 1, 3).toArray(new Integer[0]))));
    }
}