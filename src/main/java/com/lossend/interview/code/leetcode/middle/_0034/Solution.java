package com.lossend.interview.code.leetcode.middle._0034;

public class Solution {
    /**
     * 二分查找边界
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m+1;
            }
        }
        if (l >= nums.length || nums[l] != target) {
            return new int[] {-1, -1};
        }
        int leftBound = l;
        r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target) {
                r = m;
            } else {
                l = m+1;
            }
        }
        int rightBound = r-1;
        return new int[] {leftBound, rightBound};
    }
}
