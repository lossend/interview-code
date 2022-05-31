package com.lossend.interview.code.leetcode.middle._889;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < postorder.length; i++) {
            indexMap.put(postorder[i], i);
        }
        return constructFromPrePost(preorder, 0, preorder.length, postorder, 0, postorder.length, indexMap);
    }

    public TreeNode constructFromPrePost(int[] preorder, int pl, int pr, int[] postorder, int tl, int tr, Map<Integer, Integer> indexMap) {
        if (pl == pr) {
            return null;
        }
        int rootValue = preorder[pl];
        TreeNode root = new TreeNode(rootValue);
        if (pl == pr - 1) {
            return root;
        }
        int nextValue = preorder[pl + 1];
        // 左子树
        int leftIndex = indexMap.get(nextValue);
        int leftLength = leftIndex - tl + 1;
        int rightLength = tr - leftIndex - 2;
        if (leftLength > 0) {
            root.left = constructFromPrePost(preorder, pl + 1, pl + 1 + leftLength, postorder, tl, tl + leftLength, indexMap);
        }
        if (rightLength > 0) {
            root.right = constructFromPrePost(preorder, pr - rightLength, pr, postorder, leftIndex + 1, tr - 1, indexMap);
        }
        return root;
    }
}