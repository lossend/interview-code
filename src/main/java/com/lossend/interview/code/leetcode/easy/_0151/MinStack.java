package com.lossend.interview.code.leetcode.easy._0151;

import java.util.Deque;
import java.util.LinkedList;

class MinStack {
    private final Deque<Integer> stack;
    private final Deque<Integer> minStack;

    public MinStack() {
        this.stack = new LinkedList<>();
        this.minStack = new LinkedList<>();
        this.minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        this.stack.push(val);
        int min = Math.min(this.minStack.peek(), val);
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}