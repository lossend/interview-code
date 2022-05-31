package com.lossend.interview.code.sword.means.offer._0051;

import java.util.Arrays;

public class Solution {
    public int reversePairs(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int[] tmp = new int[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);
        return reversePairs(copy, 0, nums.length-1, tmp);
    }

    public int reversePairs(int[] nums, int l, int r, int[] tmp) {
        if (l == r) {
            return 0;
        }
        int m = l + (r - l) / 2;
        int leftParis = reversePairs(nums, l, m, tmp);
        int rightParis = reversePairs(nums, m+1, r, tmp);
        if (nums[m] < nums[m+1]) {
            return leftParis + rightParis;
        }
        int crossPairs = mergeAndCount(nums, l, m, r, tmp);
        return leftParis + rightParis + crossPairs;
    }
    public int mergeAndCount(int[] nums, int l, int m ,int r, int[] tmp) {
        for (int i = l; i <= r; i++) {
            tmp[i] = nums[i];
        }
        int lp = l;
        int rp = m + 1;
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (lp > m) {
                nums[i] = tmp[rp++];
            } else if (rp > r) {
                nums[i] = tmp[lp++];
            } else if (tmp[lp] <= tmp[rp]) {
                nums[i] = tmp[lp++];
            } else {
                nums[i] = tmp[rp++];
                count += m + 1 - lp;
            }
        }
        return count;
    }
}
