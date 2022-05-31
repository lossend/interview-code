package com.lossend.interview.code.leetcode.easy._0104;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int deep = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            deep++;
            while (size-- > 0) {
                TreeNode n = queue.poll();
                if (n.left != null) {
                    queue.offer(n.left);
                }
                if (n.right != null) {
                    queue.offer(n.right);
                }
            }
        }
        return deep;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth2(root.left), maxDepth2(root.right));
    }
}
