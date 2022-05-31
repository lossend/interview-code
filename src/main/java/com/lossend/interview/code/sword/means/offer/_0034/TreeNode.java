package com.lossend.interview.code.sword.means.offer._0034;

import java.util.Deque;
import java.util.LinkedList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildTree(Integer[] nums) {
        TreeNode[] nodeArr = new TreeNode[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) {
                continue;
            }
            nodeArr[i] = new TreeNode(nums[i]);

            int p = (i - 1) >> 1;
            if (p < 0 || nodeArr[p] == null) {
                continue;
            }
            if ((i & 1) == 1) {
                nodeArr[p].left = nodeArr[i];
            } else {
                nodeArr[p].right = nodeArr[i];
            }
        }
        return nodeArr[0];
    }

    public static Integer[] toArray(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        deque.add(root);
        while (root != null && !deque.isEmpty()) {
            TreeNode curr = deque.poll();
            if (curr == null) {
                result.add(null);
            } else {
                result.add(root.val);
            }
            if (curr != null) {
                deque.offer(root.left);
                deque.offer(root.right);
            }
        }
        while (!result.isEmpty() && result.peekLast() == null) {
            result.poll();
        }
        return result.toArray(new Integer[0]);
    }

    public static String toString(TreeNode root) {
        return toArray(root).toString();
    }
}
