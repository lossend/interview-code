package com.lossend.interview.code.leetcode.easy._0160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA != null ? pA.next : headB;
            pB = pB != null ? pB.next : headA;
        }
        return pA;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int lenA = getLengthOfList(headA);
        int lenB = getLengthOfList(headB);
        ListNode pA;
        ListNode pB;
        int delta = lenA - lenB;
        if (delta > 0) {
            pA = skipNode(headA, delta);
            pB = headB;
        } else {
            pA = headA;
            pB = skipNode(headB, -delta);
        }
        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }

    public int getLengthOfList(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            len++;
        }
        return len;
    }

    public ListNode skipNode(ListNode head, int num) {
        ListNode p = head;
        while (p != null && num-- > 0) {
            p = p.next;
        }
        return p;
    }
}
