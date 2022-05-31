package com.lossend.interview.code.leetcode.easy._0141;

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
}
