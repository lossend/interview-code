package com.lossend.interview.code.leetcode.middle._0139;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    /**
     * 动态规划，回溯法重复计算
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String word :
                    wordDict) {
                int start = i-word.length();
                if (start >= 0 && s.startsWith(word, start) && dp[start]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
