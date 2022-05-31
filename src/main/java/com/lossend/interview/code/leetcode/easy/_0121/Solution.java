package com.lossend.interview.code.leetcode.easy._0121;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int d = prices[i] - minPrice;
            if (d > maxProfit) {
                maxProfit = d;
            }
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        int prev = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int t1 = prices[i] - prices[i - 1];
            int t2 = prev + t1;
            int curr = t2 > 0 ? t2 : (Math.max(t1, 0));
            prev = curr;
            if (max < curr) {
                max = curr;
            }
        }
        return max;
    }
}
