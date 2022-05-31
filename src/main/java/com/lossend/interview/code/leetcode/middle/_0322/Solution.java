package com.lossend.interview.code.leetcode.middle._0322;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount];
        for (int i = 0; i < amount; i++) {
            dp[i] = -1;
            Integer min = null;
            for (int j = 0; j < coins.length; j++) {
                if ((i + 1 - coins[j]) > 0 && dp[i - coins[j]] != -1) {
                    int tmp = dp[i - coins[j]] + 1;
                    if (min == null || min > tmp) {
                        min = tmp;
                    }
                } else if (i == coins[j] - 1) {
                    min = 1;
                    break;
                }
            }
            if (min != null) {
                dp[i] = min;
            }
        }
        return dp[amount - 1];
    }
}
