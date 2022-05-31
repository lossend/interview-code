package com.lossend.interview.code.leetcode.easy._0283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j + 1] = nums[i];
                j++;
            }
        }
        for (j++; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
