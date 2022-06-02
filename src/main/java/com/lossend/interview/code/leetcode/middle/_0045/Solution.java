package com.lossend.interview.code.leetcode.middle._0045;

public class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length-1; i++) {
            int step = nums[i];
            int d = Math.min(nums.length, i+step+1);
            // dp[i] 肯定是不会为0的
            for (int j = i+1; j < d; j++) {
                if (dp[j] == 0) {
                    dp[j] = dp[i]+1;
                } else {
                    dp[j] = Math.min(dp[i]+1, dp[j]);
                }
            }
            if (d >= nums.length) {
                break;
            }
        }
        return dp[nums.length-1];
    }
}
