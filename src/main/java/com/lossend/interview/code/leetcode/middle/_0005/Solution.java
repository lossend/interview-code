package com.lossend.interview.code.leetcode.middle._0005;

public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLength = 0;
        int maxLeft = -1;
        int maxRight = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                boolean same = s.charAt(j) == s.charAt(i);
                if (j == i) {
                    dp[j][i] = true;
                } else if (j == (i - 1)) {
                    dp[j][i] = same;
                } else {
                    dp[j][i] = dp[j + 1][i - 1] & same;
                }
                if (dp[j][i] && maxLength < i - j + 1) {
                    maxLength = i - j + 1;
                    maxLeft = j;
                    maxRight = i;
                }
            }
        }

        return s.substring(maxLeft, maxRight + 1);
    }
}
