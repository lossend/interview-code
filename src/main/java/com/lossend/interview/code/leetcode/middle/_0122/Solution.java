package com.lossend.interview.code.leetcode.middle._0122;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            dp[i] = 0;
            for (int j = 0; j <= i; j++) {
                int delta = prices[i] - prices[j] ;
                if (delta < 0) {
                    delta = 0;
                }
                dp[i]  = Math.max(dp[i], dp[j] + delta);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
