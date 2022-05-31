package com.lossend.interview.code.leetcode.hard._0148;


public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode dumpL = new ListNode();
        ListNode dumpR = new ListNode();
        ListNode prevL = dumpL;
        ListNode prevR = dumpR;
        ListNode p = head;
        boolean triggle = true;
        while (p != null) {
            if (triggle) {
                prevR.next = p;
                prevR = p;
            } else {
                prevL.next = p;
                prevL = p;
            }
            triggle = !triggle;
            p = p.next;
        }
        prevR.next = null;
        prevL.next = null;
        return sort(sortList(dumpL.next), sortList(dumpR.next));
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
