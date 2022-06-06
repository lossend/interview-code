package com.lossend.interview.code.leetcode.middle._0016;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int targetSum = 0;
       int minDelta = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int delta = sum - target ;
                if (Math.abs(delta) < minDelta) {
                    minDelta = Math.abs(delta);
                   targetSum = sum;
                }
                if (delta < 0) {
                    left = left+1;
                } else if (delta > 0) {
                    right = right-1;
                } else {
                    return target;
                }
            }
        }
       return targetSum;
    }
}
