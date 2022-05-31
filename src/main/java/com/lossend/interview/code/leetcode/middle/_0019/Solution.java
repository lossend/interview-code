package com.lossend.interview.code.leetcode.middle._0019;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return head;
        }
        ListNode p = head;
        while (n-- > 0 && p != null) {
            p = p.next;
        }
        if (n > 0) {
            return head;
        }
        ListNode dump = new ListNode(0, head);
        ListNode pN = dump;
        while (p != null) {
            pN = pN.next;
            p = p.next;
        }
        pN.next = pN.next.next;
        return dump.next;
    }
}
