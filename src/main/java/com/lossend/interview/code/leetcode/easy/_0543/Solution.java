package com.lossend.interview.code.leetcode.easy._0543;

public class Solution {
    class NodeInfo {
        int max;
        int depth;

        NodeInfo(int max, int depth) {
            this.depth = depth;
            this.max = max;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return getNodeInfo(root).max;
    }

    private NodeInfo getNodeInfo(TreeNode root) {
        if (root == null) {
            return new NodeInfo(0, 0);
        }
        NodeInfo lInfo = getNodeInfo(root.left);
        NodeInfo rInfo = getNodeInfo(root.right);
        int max = Math.max(lInfo.depth + rInfo.depth, Math.max(lInfo.max, rInfo.max));
        return new NodeInfo(max, Math.max(lInfo.depth, rInfo.depth) + 1);
    }
}
