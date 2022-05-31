package com.lossend.interview.code.leetcode.middle._0116;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static Node buildTree(Integer[] nums) {
        Node[] treeArr = new Node[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) {
                continue;
            }
            treeArr[i] = new Node(nums[i]);
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
}
