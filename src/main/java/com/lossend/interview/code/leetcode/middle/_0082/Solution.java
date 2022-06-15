package com.lossend.interview.code.leetcode.middle._0082;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dump = new ListNode(Integer.MIN_VALUE, head);
        ListNode prev = dump;
        ListNode last = dump;
        ListNode p = head;
        boolean duplicate = false;
        while (p != null) {
            // 前一个没有重复
            if (prev.val != p.val) {
                if (!duplicate) {
                    last = prev;
                }
                duplicate = false;
            } else {
                duplicate = true;
                last.next = p.next;
            }
            prev = p;
            p = p.next;
        }
        return dump.next;
    }
}
