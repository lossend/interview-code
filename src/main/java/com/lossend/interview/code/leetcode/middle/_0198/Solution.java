package com.lossend.interview.code.leetcode.middle._0198;

public class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = nums[i];
            } else if (i == 1) {
                dp[i] = Math.max(dp[i-1] , nums[i]);
            } else {
                dp[i] = Math.max(dp[i-1] , nums[i]+dp[i-2]);
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
