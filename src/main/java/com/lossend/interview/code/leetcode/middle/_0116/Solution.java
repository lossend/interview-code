package com.lossend.interview.code.leetcode.middle._0116;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public Node connect(Node root) {
        Deque<Node> deque = new LinkedList<>();
        if (root == null) {
            return null;
        }
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size-- > 0) {
                Node n = deque.poll();
                if (n != null) {
                    if (size != 0) {
                        n.next = deque.peek();
                    }
                    deque.offer(n.left);
                    deque.offer(n.right);
                }
            }
        }
        return root;
    }
}
