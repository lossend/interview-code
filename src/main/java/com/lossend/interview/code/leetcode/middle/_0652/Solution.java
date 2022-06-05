package com.lossend.interview.code.leetcode.middle._0652;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * 主要考察树的序列化
     * @param root
     * @return
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Map<String, Integer> counter = new HashMap<>();
        findDuplicateSubtrees(root, result, counter);
        return  result;
    }
    public String findDuplicateSubtrees(TreeNode r, List<TreeNode> result, Map<String, Integer> counter) {
        if (r == null) {
            return "#";
        }
        String s = r.val + "," +findDuplicateSubtrees(r.left, result, counter) + "," + findDuplicateSubtrees(r.right, result, counter);
        Integer count = counter.getOrDefault(s, 0);
        counter.put(s, ++count);
        if (count == 2) {
            result.add(r);
        }
        return s;

    }
    public static boolean equals(TreeNode l, TreeNode r) { if (l == r)  {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        if (l.val != r.val) {
            return false;
        }
        return equals(l.left, r.left) && equals(l.right, r.right);
    }
}
