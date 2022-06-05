package com.lossend.interview.code.leetcode.middle._0064;

public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 &&  j == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }
                int p =  i-1 >= 0? dp[i-1][j] : Integer.MAX_VALUE;
                int q =  j-1 >= 0? dp[i][j-1] : Integer.MAX_VALUE;
                dp[i][j] = Math.min(p, q) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
