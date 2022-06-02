package com.lossend.interview.code.leetcode.middle._0793;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {


    /**
     * 单调栈解法
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()) {
                int j = stack.peek();
                if (temperatures[i] > temperatures[j]) {
                    result[j] = i - j;
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return result;
    }
}
