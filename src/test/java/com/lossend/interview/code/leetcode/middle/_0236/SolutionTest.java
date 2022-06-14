package com.lossend.interview.code.leetcode.middle._0236;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lowestCommonAncestor() {
        TreeNode t = TreeNode.buildTree(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4).toArray(new Integer[0]));
        TreeNode p = t.findByValue(5);
        TreeNode q = t.findByValue(1);
        TreeNode r = t.findByValue(4);
        TreeNode s = t.findByValue(3);
        assertEquals(s, new Solution().lowestCommonAncestor(t, p, q));
        assertEquals(p, new Solution().lowestCommonAncestor(t, p, r));
    }
}