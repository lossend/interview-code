package com.lossend.interview.code.leetcode.easy._0101;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Deque<TreeNode> lStack = new LinkedList<>();
        Deque<TreeNode> rStack = new LinkedList<>();
        lStack.push(root.left);
        rStack.push(root.right);

        while (!lStack.isEmpty() && !rStack.isEmpty()) {
            TreeNode lt = lStack.pop();
            TreeNode rt = rStack.pop();
            if (lt == null && rt == null) {
                continue;
            }
            if (lt == null || rt == null) {
                return false;
            }
            if (lt.val != rt.val) {
                return false;
            }
            lStack.push(lt.left);
            lStack.push(lt.right);
            rStack.push(rt.right);
            rStack.push(rt.left);
        }
        return lStack.isEmpty() && rStack.isEmpty();
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null || l.val != r.val) {
            return false;
        }
        return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
}
