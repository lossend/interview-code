package com.lossend.interview.code.leetcode.easy._0021;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private static ListNode buildList(int[] nums) {
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

    @Test
    void testMergeTwoLists() {
        ListNode l1 = buildList(new int[]{1, 2, 4});
        ListNode l2 = buildList(new int[]{1, 3, 4});
        ListNode r = new Solution().mergeTwoLists(l1, l2);
        printList(r);
    }

    @Test
    void testMergeTwoLists2() {
        ListNode l1 = buildList(new int[]{});
        ListNode l2 = buildList(new int[]{0});
        ListNode r = new Solution().mergeTwoLists(l1, l2);
        printList(r);
    }
}