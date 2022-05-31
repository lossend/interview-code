package com.lossend.interview.code.leetcode.easy._0070;

class Solution {
    public int climbStairs(int n) {
        int prev = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            int tmp = curr;
            if (i == 0) {
                curr = 1;
            } else if (i == 1) {
                curr = 2;
            } else {
                curr = curr + prev;
            }
            prev = tmp;
        }
        return curr;
    }
}
