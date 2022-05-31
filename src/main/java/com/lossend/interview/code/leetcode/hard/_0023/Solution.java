package com.lossend.interview.code.leetcode.hard._0023;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length < 2) {
            return lists[0];
        }
        ListNode f = null;
        for (ListNode p : lists) {
            f = sort(f, p);
        }
        return f;
    }

    public ListNode sort(ListNode l, ListNode r) {
        if (l == null) {
            return r;
        }
        if (r == null) {
            return l;
        }

        ListNode dump = new ListNode();
        ListNode prev = dump;
        while (l != null && r != null) {
            ListNode n;
            if (l.val <= r.val) {
                n = new ListNode(l.val);
                l = l.next;
            } else {
                n = new ListNode(r.val);
                r = r.next;
            }
            prev.next = n;
            prev = n;
        }
        if (l == null) {
            prev.next = r;
        } else {
            prev.next = l;
        }

        return dump.next;
    }
}
