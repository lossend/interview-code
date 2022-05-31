package com.lossend.interview.code.leetcode.easy._0226;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.right = invertTree(l);
        root.left = invertTree(r);
        return root;
    }
}
