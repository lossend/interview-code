package com.lossend.interview.code.leetcode.middle._0236;

import java.util.*;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();
        List<TreeNode> stack = new ArrayList<>();
        stack.add(root);
        backtrace(root, p, q, stack,pList, qList);
        int length = Math.min(pList.size(), qList.size());
        TreeNode r = null;
        for (int i = 0; i < length; i++) {
            if(pList.get(i) != qList.get(i)) {
               break;
            }
            r = pList.get(i);
        }
        return r;
    }

    public void backtrace(TreeNode root, TreeNode p , TreeNode q, List<TreeNode> stack, List<TreeNode> pList, List<TreeNode> qList) {
        if (root == null) {
            return;
        }
        if (p == root && pList.isEmpty()) {
            pList.addAll(stack);
        }
        if (q == root && qList.isEmpty()) {
            qList.addAll(stack);
        }
        if (!pList.isEmpty() && !qList.isEmpty()) {
            return;
        }
        if (root.left != null) {
            stack.add(root.left);
            backtrace(root.left, p, q, stack, pList, qList);
            stack.remove(stack.size()-1);
        }
        if (root.right != null) {
            stack.add(root.right);
            backtrace(root.right, p, q, stack, pList, qList);
            stack.remove(stack.size()-1);
        }
    }
}

