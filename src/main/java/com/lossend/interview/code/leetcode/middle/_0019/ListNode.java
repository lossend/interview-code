package com.lossend.interview.code.leetcode.middle._0019;

/**
 * @author yanchang
 * @desc
 * @date 2022/5/12
 **/

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode from(int[] nums) {
        ListNode head = new ListNode();
        ListNode prev = head;
        for (int num : nums) {
            prev.next = new ListNode(num);
            prev = prev.next;
        }
        return head.next;
    }

    public static ListNode cycleList(int[] nums, int post) {
        ListNode head = new ListNode();
        ListNode prev = head;
        for (int num : nums) {
            prev.next = new ListNode(num);
            prev = prev.next;
        }
        if (post >= 0) {
            ListNode cycleNode = head;
            while (post-- >= 0) {
                cycleNode = cycleNode.next;
            }
            prev.next = cycleNode;
        }
        return head.next;
    }

    public ListNode indexOf(int idx) {
        if (idx < 0) {
            return null;
        }
        ListNode p = this;
        while (idx-- > 0) {
            p = p.next;
        }
        return p;
    }

    public static ListNode createConcat(int[] nums, ListNode append) {
        ListNode head = new ListNode();
        ListNode prev = head;
        for (int num : nums) {
            prev.next = new ListNode(num);
            prev = prev.next;
        }
        prev.next = append;
        return head.next;
    }

    public static boolean isSame(ListNode l, ListNode r) {
        if (l == r) {
            return true;
        }
        while (l != null && r != null) {
            if (l.val != r.val) {
                return false;
            }
            l = l.next;
            r = r.next;
        }
        return l == r;
    }

    public static String toString(ListNode head) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        ListNode p = head;
        while (p != null) {
            if (p != head) {
                builder.append(",");
            }
            builder.append(p.val);
            p = p.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
