package com.lossend.interview.code.leetcode.middle._0098;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long leftBound, long rightBound) {
        if (root == null) {
            return true;
        }
        if (root.val <= leftBound || root.val >= rightBound) {
            return false;
        }

        return isValidBST(root.left, leftBound, root.val) && isValidBST(root.right,root.val, rightBound);
    }
}
