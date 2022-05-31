package com.lossend.interview.code.leetcode.easy._0461;

public class Solution {
    public int hammingDistance(int x, int y) {
        return countOfBits(x ^ y);
    }

    public int countOfBits(int x) {
        int count = 0;
        while (x > 0) {
            x &= x - 1;
            count++;
        }
        return count;
    }
}
