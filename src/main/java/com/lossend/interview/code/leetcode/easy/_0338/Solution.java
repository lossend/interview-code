package com.lossend.interview.code.leetcode.easy._0338;

public class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            count[i] = count[i & (i - 1)] + 1;
        }
        return count;
    }

    public int countBitsOfNum(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x &= x - 1;
        }
        return count;
    }
}
