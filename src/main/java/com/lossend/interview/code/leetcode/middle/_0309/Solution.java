package com.lossend.interview.code.leetcode.middle._0309;

public class Solution {
    public int maxProfit(int[] prices) {
      int[][] dp = new int[prices.length][3];
      // dp0: 持有股票当前最大收益
        // dp1: 没有股票，冻结期最大收益
        // dp2：没有股票，没有冻结期最大收益
        dp[0][0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
           dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);
           dp[i][1] = dp[i-1][0]+prices[i];
           dp[i][2] = Math.max(dp[i-1][1], dp[i-1][2]);
        }
        return Math.max(dp[prices.length-1][1], dp[prices.length-1][2]);
    }
}
