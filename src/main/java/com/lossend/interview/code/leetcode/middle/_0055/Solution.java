package com.lossend.interview.code.leetcode.middle._0055;

public class Solution {
    public boolean canJump(int[] nums) {
        int maxLength  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxLength) {
                break;
            }
           int d = i + nums[i];
           if (maxLength < d) {
               maxLength = d;
           }
        }
        return  maxLength >= nums.length - 1;
    }
}
