package com.lossend.interview.code.leetcode.easy._0002;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = buildList(new int[]{9, 9, 9, 9});
        ListNode r = new Solution().addTwoNumbers(l1, l2);
        printList(r);
    }


    public static ListNode buildList(int[] nums) {
        ListNode head = new ListNode();
        ListNode prev = head;
        for (int num : nums) {
            ListNode next = new ListNode(num, null);
            prev.next = next;
            prev = next;
        }
        return head.next;
    }

    public static void printList(ListNode node) {
        System.out.print("[");
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(", ");
            }
            node = node.next;
        }
        System.out.println("]");
    }
}