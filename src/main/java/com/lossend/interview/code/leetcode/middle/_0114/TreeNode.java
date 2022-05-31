package com.lossend.interview.code.leetcode.middle._0114;

import java.util.Arrays;
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
        TreeNode[] treeArr = new TreeNode[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) {
                continue;
            }
            treeArr[i] = new TreeNode(nums[i]);
            if (i > 0) {
                int p = (i - 1) >> 1;
                if (i % 2 == 1) {
                    treeArr[p].left = treeArr[i];
                } else {
                    treeArr[p].right = treeArr[i];
                }
            }
        }
        return nums.length > 0 ? treeArr[0] : null;
    }

    public static Integer[] toArray(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        while (root != null || !deque.isEmpty()) {
            if (root != null) {
                list.add(root.val);
                deque.offer(root.left);
                deque.offer(root.right);
            } else {
                list.add(null);
            }
            root = deque.poll();
        }
        while (list.peekLast() == null) {
            list.removeLast();
        }
        return list.toArray(new Integer[0]);
    }

    public static String toString(TreeNode root) {
        return Arrays.toString(toArray(root));
    }
}
