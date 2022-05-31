package com.lossend.interview.code.leetcode.middle._0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int t = target - nums[i] - nums[j];
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (l != j + 1 && nums[l] == nums[l - 1]) {
                        l++;
                        continue;
                    }
                    if (r != nums.length - 1 && nums[r] == nums[r + 1]) {
                        r--;
                        continue;
                    }
                    int sum = nums[l] + nums[r];
                    if (sum < t) {
                        l++;
                    } else if (sum > t) {
                        r--;
                    } else {
                        result.add((Arrays.asList(nums[i], nums[j], nums[l], nums[r])));
                        l++;
                        r--;
                    }
                }

            }
        }
        return result;
    }
}
