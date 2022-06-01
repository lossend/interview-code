package com.lossend.interview.code.leetcode.middle._416;

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int i = 1; i < nums.length+1; i++) {
            for (int j = target; j > 0; j--) {
                dp[j] = dp[j] || ((j - nums[i-1] >= 0) && dp[j-nums[i-1]]);
            }
        }
        return dp[target];
    }
}
