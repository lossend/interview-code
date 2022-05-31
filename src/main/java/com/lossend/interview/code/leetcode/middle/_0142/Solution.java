package com.lossend.interview.code.leetcode.middle._0142;

public class Solution {
    /**
     * 通过快慢指针找到交集，然后从head开始和这个节点同速前进，两者相交就是环型的开始
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (fast == null || fast.next == null || fast.next.next == null) {
            return null;
        }
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return null;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
