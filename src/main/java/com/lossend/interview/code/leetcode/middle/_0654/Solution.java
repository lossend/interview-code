package com.lossend.interview.code.leetcode.middle._0654;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int maxIndex = l - 1;
        int max = Integer.MIN_VALUE;
        for (int i = l; i < r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode left = constructMaximumBinaryTree(nums, l, maxIndex);
        TreeNode right = constructMaximumBinaryTree(nums, maxIndex + 1, r);
        return new TreeNode(max, left, right);
    }
}
