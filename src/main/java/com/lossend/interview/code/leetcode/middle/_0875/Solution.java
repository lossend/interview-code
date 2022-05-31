package com.lossend.interview.code.leetcode.middle._0875;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        int l = 1;
        int r = max;
        while (l < r) {
            int m = (l + r) / 2;
            int result = 0;
            for (int pile : piles) {
                result += (pile + m - 1) / m;
            }
            if (result <= h) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
