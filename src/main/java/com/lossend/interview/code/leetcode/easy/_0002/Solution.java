package com.lossend.interview.code.leetcode.easy._0002;

/**
 * @author yanchang
 * @desc
 * @date 2022/5/12
 **/
public class Solution {
    /**
     * #2. Add Two Numbers
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode left = l1;
        ListNode right = l2;
        ListNode sumNode = new ListNode();
        ListNode prevNode = sumNode;
        int r = 0;
        while(left != null || right != null) {
            if (left != null) {
                r += left.val;
                left = left.next;
            }
            if (right != null) {
                r += right.val;
                right = right.next;
            }
            ListNode newNode = new ListNode(r % 10, null);
            prevNode.next = newNode;
            prevNode = newNode;
            r = r / 10;
        }
        if (r > 0) {
            prevNode.next = new ListNode(r % 10, null);
        }
        return sumNode.next;
    }
}
