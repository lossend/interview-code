package com.lossend.interview.code.leetcode.middle._0652;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDuplicateSubtrees() {
        List<TreeNode> result = new Solution().findDuplicateSubtrees(TreeNode.buildTree(new Integer[]{1,2,3,4,null,2,4,null,null, null, null,4}));
        assertEquals("[[4], [2, 4]]", result.toString());
        TreeNode t2 = TreeNode.buildTree(new Integer[] {2,1,1});
        result = new Solution().findDuplicateSubtrees(t2);
        assertEquals("[[1]]", result.toString());
        TreeNode t3 = TreeNode.buildTree(new Integer[] {2,2,2,3,null,3,null});
        result = new Solution().findDuplicateSubtrees(t3);
        assertEquals("[[3], [2, 3]]", result.toString());
    }
}