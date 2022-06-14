package com.lossend.interview.code.leetcode.middle._0024;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode dump = new ListNode();
        ListNode prev = dump;
        prev.next = head;
        while (p !=  null && p.next != null) {
            ListNode n = p.next.next;
            ListNode first = p.next;
            prev.next = first;
            ListNode second = p;
            first.next = second;
            second.next = n;
            p  = n;
            prev = second;
        }
        return dump.next;
    }
}
