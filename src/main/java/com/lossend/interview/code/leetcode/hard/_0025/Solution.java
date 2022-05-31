package com.lossend.interview.code.leetcode.hard._0025;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode h = head;
        ListNode p = head;
        int cnt = k;
        while (p != null && cnt-- > 0) {
            p = p.next;
        }
        if (cnt > 0) {
            return head;
        }
        ListNode newHead = revertList(h, p);
        h.next = reverseKGroup(p, k);
        return newHead;
    }

    public ListNode revertList(ListNode h, ListNode t) {
        if (h == null) {
            return null;
        }
        ListNode prev = t;
        ListNode p = h;
        while (p != t) {
            ListNode n = p.next;
            p.next = prev;
            prev = p;
            p = n;
        }
        return prev;
    }
}
