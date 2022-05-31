package com.lossend.interview.code.leetcode.middle._0106;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length, indexMap);
    }

    public TreeNode buildTree(int[] inorder, int il, int ir, int[] postorder, int pl, int pr, Map<Integer, Integer> indexMap) {
        if (il == ir) {
            return null;
        }
        int value = postorder[pr - 1];
        TreeNode root = new TreeNode(value);
        int rootIndex = indexMap.get(value);
        int leftLength = rootIndex - il;
        int rightLength = ir - rootIndex - 1;
        if (leftLength > 0) {
            root.left = buildTree(inorder, il, rootIndex, postorder, pl, pl + leftLength, indexMap);
        }
        if (rightLength > 0) {
            root.right = buildTree(inorder, rootIndex + 1, ir, postorder, pr - rightLength - 1, pr - 1, indexMap);
        }
        return root;
    }
}
