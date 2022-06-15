package com.lossend.interview.code.leetcode.middle._0560;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCounter = new HashMap<>();
        int[] dp = new int[nums.length];
        int sum = 0;
        sumCounter.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                dp[i] = dp[i-1];
            }
            sum+= nums[i];
            int delta = sum - k;
            int count = sumCounter.getOrDefault(delta, 0);
            dp[i] += count;
            sumCounter.put(sum, sumCounter.getOrDefault(sum, 0)+1);
        }
        return dp[nums.length-1];
    }
}
