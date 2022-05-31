package com.lossend.interview.code.leetcode.easy._0141;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (slowNode != null && fastNode != null) {
            if (slowNode == fastNode) {
                return true;
            }
            slowNode = slowNode.next;
            if (fastNode.next == null) {
                break;
            }
            fastNode = fastNode.next.next;
        }
        return false;
    }
}
