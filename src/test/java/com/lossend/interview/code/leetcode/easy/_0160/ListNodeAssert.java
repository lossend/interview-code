package com.lossend.interview.code.leetcode.easy._0160;

import org.assertj.core.api.AbstractAssert;

public class ListNodeAssert extends AbstractAssert<ListNodeAssert, ListNode> {
    protected ListNodeAssert(ListNode listNode) {
        super(listNode, ListNodeAssert.class);
    }

    @Override
    public ListNodeAssert isEqualTo(Object expected) {
        if (ListNode.isSame(this.actual, (ListNode) expected)) {
            return this;
        }
        failWithMessage("Expected list to be <%s> but was <%s>", ListNode.toString((ListNode) expected), ListNode.toString(this.actual));
        return this;
    }
}
