package com.lossend.interview.code.leetcode.middle._0105;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode buildTree(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl == pr) {
            return null;
        }
        int rootValue = preorder[pl];
        TreeNode root = new TreeNode(rootValue);
        int idx = -1;
        for (int i = il; i < ir; i++) {
            if (rootValue == inorder[i]) {
                idx = i;
                break;
            }
        }
        int leftLength = idx - il;
        int rightLength = ir - idx - 1;
        if (leftLength > 0) {
            root.left = buildTree(preorder, pl + 1, pl + 1 + leftLength, inorder, il, ir);
        }
        if (rightLength > 0) {
            root.right = buildTree(preorder, pl + 1 + leftLength, pr, inorder, idx + 1, ir);
        }
        return root;
    }
}
