package com.lossend.interview.code.leetcode.middle._0007;

public class Solution {
    public int reverse(int x) {
        int sign = x > 0 ? 1 : -1;
        x = sign * x;
        int result = 0;
        while (x > 0) {
            if (result != result * 10 / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result * sign;
    }
}
