package com.lossend.interview.code.leetcode.middle._0221;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxLength = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                   if (i == 0 || j == 0) {
                       dp[i][j] = 1;
                   } else {
                       dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) +1;
                   }
                   maxLength = Math.max(dp[i][j], maxLength);
                }
            }
        }
        return maxLength * maxLength;
    }
}
