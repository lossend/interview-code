package com.lossend.interview.code.leetcode.middle._0114;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
            n.left = null;
            n.right = stack.peek();
        }
    }
}
