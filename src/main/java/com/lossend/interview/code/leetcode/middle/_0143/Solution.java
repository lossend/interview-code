package com.lossend.interview.code.leetcode.middle._0143;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        while (p!= null) {
            list.add(p);
            p = p.next;
        }
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            list.get(i++).next = list.get(j);
            list.get(j--).next = list.get(i);
        }
        list.get(i).next = null;
    }
}
