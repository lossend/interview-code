package com.lossend.interview.code.leetcode.easy._0303;

class NumArray {
    private final int[] preSum;

    public NumArray(int[] nums) {
        this.preSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            preSum[i] = sum;
        }

    }

    public int sumRange(int left, int right) {
        int l = left > 0 ? preSum[left - 1] : 0;
        int r = preSum[right];
        return r - l;
    }
}

