package com.lossend.interview.code.leetcode.easy._0151;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {
    @Test
    void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        minStack.top();    // return 0
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }
}