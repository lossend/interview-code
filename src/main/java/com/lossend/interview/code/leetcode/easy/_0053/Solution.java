package com.lossend.interview.code.leetcode.easy._0053;

class Solution {
    class Status {
        int lSum;// 包含左边节点最大和
        int rSum; // 包含右边节点最大和
        int mSum; // 整个区间最大和
        int sSum; // 整个区间和

        Status(int lSum, int rSum, int mSum, int sSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.sSum = sSum;
        }
    }

    public int maxSubArray(int[] nums) {
        Status s = getStatus(nums, 0, nums.length - 1);
        return s.mSum;
    }

    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        Integer curr = null;
        for (int num : nums) {
            if (curr != null) {
                curr = curr > 0 ? num + curr : num;
            } else {
                curr = num;
            }
            if (max < curr) {
                max = curr;
            }
        }
        return max;
    }

    public Status getStatus(int[] nums, int l, int r) {
        if (l == r) {
            return new Status(nums[r], nums[r], nums[r], nums[r]);
        }
        int m = (l + r) / 2;
        Status lStatus = getStatus(nums, l, m);
        Status rStatus = getStatus(nums, m + 1, r);
        int lSum = Math.max(lStatus.lSum, lStatus.sSum + rStatus.lSum);
        int rSum = Math.max(rStatus.rSum, lStatus.rSum + rStatus.sSum);
        int sSum = lStatus.sSum + rStatus.sSum;
        int mSum = Math.max(Math.max(lStatus.mSum, rStatus.mSum), lStatus.rSum + rStatus.lSum);
        return new Status(lSum, rSum, mSum, sSum);
    }
}