package com.lossend.interview.code.leetcode.middle._0152;

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[][] dp = new int[nums.length+1][2];
        dp[0][0] = 1;
        int maxProduct = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] >= 0) {
              dp[i+1][0] = Math.max(dp[i][0] * nums[i], nums[i]);
              dp[i+1][1] = Math.min(dp[i][1] * nums[i], 0);
           } else {
               dp[i+1][0] = Math.max(dp[i][1] * nums[i], 0);
               dp[i+1][1] = Math.min(dp[i][0] * nums[i], nums[i]);
           }
           if (maxProduct < dp[i+1][0]) {
               maxProduct = dp[i+1][0];
           }
        }
        return maxProduct;
    }
}
