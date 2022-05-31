package com.lossend.interview.code.leetcode.easy._0234;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode half = getHalf(head);
        ListNode revert = reverseList(half.next);
        ListNode l = head;
        ListNode r = revert;
        boolean result = true;
        while (r != null && result) {
            if (l.val != r.val) {
                result = false;
                break;
            }
            l = l.next;
            r = r.next;
        }
        revert = reverseList(revert);
        half.next = revert;
        return result;
    }

    /**
     * 使用快慢指针找到中间位置
     *
     * @param head
     * @return
     */
    public ListNode getHalf(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
