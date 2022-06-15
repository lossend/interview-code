package com.lossend.interview.code.leetcode.middle._0113;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> total = new ArrayList<>();
        backtrace(root, 0, targetSum, path, total);
        return total;
    }

    private void backtrace(TreeNode root, int sum, int targetSum, List<Integer> path, List<List<Integer>> total) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        sum += root.val;
        if (root.left == null && root.right == null)  {
            if (sum == targetSum) {
                total.add(new ArrayList<>(path));
            }
        }
        backtrace(root.left, sum, targetSum, path, total);
        backtrace(root.right, sum, targetSum, path, total);
        path.remove(path.size()-1);
    }
}
